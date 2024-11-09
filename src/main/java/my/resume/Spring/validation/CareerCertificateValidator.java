package my.resume.Spring.validation;

import my.resume.Spring.model.CareerCertificate;
import my.resume.Spring.utility.validationutilities.ValidationDateUtility;
import my.resume.Spring.utility.validationutilities.ValidationSpecialCaseUtility;
import my.resume.Spring.utility.validationutilities.ValidationStringUtility;

public class CareerCertificateValidator {
    public static void validate(CareerCertificate certificate){
        ValidationStringUtility.validateStringNotNull(certificate.getCertificate());
        ValidationStringUtility.validateStringNotEmpty(certificate.getCertificate());
        ValidationDateUtility.validateDateNotNull(certificate.getCompletionDate());
        ValidationDateUtility.validateDateNotInFuture(certificate.getCompletionDate());
        ValidationSpecialCaseUtility.validateCompletionDateWhenCertificateIsPresent(certificate.getCertificate(), certificate.getCompletionDate());
        ValidationSpecialCaseUtility.validateCompletionDateWhenCertificateIsPresentAndDateInFuture(certificate.getCertificate(), certificate.getCompletionDate());
        ValidationSpecialCaseUtility.validateCertificateWhenCompletionDateIsPresent(certificate.getCertificate(),certificate.getCompletionDate());
}
}