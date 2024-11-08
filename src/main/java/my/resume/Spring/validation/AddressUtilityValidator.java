package my.resume.Spring.validation;

import my.resume.Spring.model.AddressLocation;
import my.resume.Spring.utility.validationutilities.ValidationIntUtility;
import my.resume.Spring.utility.validationutilities.ValidationSpecialCaseUtility;
import my.resume.Spring.utility.validationutilities.ValidationStringUtility;

public class AddressUtilityValidator {
    public static void AddressUtilityValidate (AddressLocation address) {
        ValidationIntUtility.validateIntNotZero(address.getStreetNumber());
        ValidationIntUtility.validateIntNotNegative(address.getStreetNumber());
        ValidationIntUtility.validateIntNotNull(address.getStreetNumber());
        ValidationSpecialCaseUtility.validateStreetDetails(address.getStreetName(), address.getStreetNumber());
        ValidationSpecialCaseUtility.validateStreetNumberWhenNameIsPresent(address.getStreetName(), address.getStreetNumber());
        ValidationSpecialCaseUtility.validateStreetNameWhenNumberIsPresent(address.getStreetName(), address.getStreetNumber());
        ValidationStringUtility.validateStringNotNull(address.getStreetName());
        ValidationStringUtility.validateStringNotEmpty(address.getStreetName());
        ValidationStringUtility.validateStringNotNull(address.getCity());
        ValidationStringUtility.validateStringNotEmpty(address.getCity());
        ValidationStringUtility.validateStringNotNull(address.getState());
        ValidationStringUtility.validateStringNotEmpty(address.getState());
        ValidationIntUtility.validateIntNotZero(address.getZipCode());
        ValidationIntUtility.validateIntNotNegative(address.getZipCode());
        ValidationIntUtility.validateIntNotNull(address.getZipCode());
        
    }
}
