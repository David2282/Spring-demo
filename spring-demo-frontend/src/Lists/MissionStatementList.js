import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';

class MissionStatementList extends Component {
    
    constructor(props) {
        super(props);
        this.state = {missionStatements: []};
        this.remove = this.remove.bind(this);
    }

    componentDidMount() {
        fetch('/api/mission-statement/')
            .then(response => response.json())
            .then(data => this.setState({missionStatements: data}));
    }
    async remove(idToDelete) {
        await fetch(`/api/mission-statement/${idToDelete}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }).then(() => {
            let updatedMissionStatements = [...this.state.missionStatements].filter(i => i.id !== idToDelete);
            this.setState({missionStatements: updatedMissionStatements});
        });
    }
    //After line 41, make sure to change <td>'s to assoc model attributes:obj.name, obj.address, etc 
    render() {
        const {missionStatements, isLoading} = this.state;
    
        if (isLoading) {
            return <p>Loading...</p>;
        }
    
        const MissionStatementList = missionStatements.map(msObj => {
            return <tr key={msObj.id}>
                <td>{msObj.myCareer}</td>
                <td>
                    <ButtonGroup>
                        <Button size="sm" color="primary" tag={Link} to={"/api/mission-statment/" + msObj.id}>Edit</Button>
                        <Button size="sm" color="danger" onClick={() => this.remove(msObj.id)}>Delete</Button>
                    </ButtonGroup>
                </td>
            </tr>
        });
    
        return (
            <div>
                <AppNavbar/>
                <Container fluid>
                    <div className="float-right">
                        <Button color="success" tag={Link} to="/api/mission-statement/">Add Mission Statement</Button>
                    </div>
                    <h3>Mission Statements</h3>
                    <Table className="mt-4">
                        <thead>
                        <tr>
                            <th width="60%">Mission Statement</th>
                            <th width="40%">Actions</th>
                        </tr>
                        </thead>
                        <tbody>
                        {MissionStatementList}
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}
export default MissionStatementList;

//Make a list of every model in this structure