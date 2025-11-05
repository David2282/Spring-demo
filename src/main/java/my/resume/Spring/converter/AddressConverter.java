package my.resume.Spring.converter;

import my.resume.Spring.dto.AddressDTO;
import my.resume.Spring.model.Address;

public class AddressConverter {

        public static AddressDTO toDTO(Address src) {
            if (src == null) return null;
            Address dto = src; // just to make names clear

            AddressDTO out = new AddressDTO();
            out.setStreet(dto.getStreet());
            out.setCity(dto.getCity());
            out.setState(dto.getState());
            out.setPostalCode(dto.getPostalCode());
            return out;
        }

        public static Address dtoToEntity(AddressDTO src) {
            if (src == null) return null;
            AddressDTO dto = src; 

            Address out = new Address();
            out.setStreet(dto.getStreet());
            out.setCity(dto.getCity());
            out.setState(dto.getState());
            out.setPostalCode(dto.getPostalCode());
            return out;
        }
}
