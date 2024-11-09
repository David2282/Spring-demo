package my.resume.Spring.messages;

public class ValidationMessages {
     // Integer validation messages
     public static final String INT_NOT_ZERO = "Integer cannot be zero. ";
     public static final String INT_POSITIVE = "Integer must be positive. ";
     public static final String INT_IN_RANGE = "Integer must be between %d and %d. ";
     public static final String INT_VALUE_REQUIRED = "A value must be provided for this field. ";
 
     // String validation messages
     public static final String STRING_NOT_NULL = "String cannot be null. ";
     public static final String STRING_EMPTY = "String cannot be empty. ";
 
     // Date validation messages
     public static final String DATE_NOT_NULL = "Date cannot be null. ";
     public static final String DATE_NOT_IN_FUTURE = "Date cannot be in the future. ";
 
     // Array validation messages
     public static final String ARRAY_NOT_NULL = "Array cannot be null. ";
     public static final String ARRAY_NOT_EMPTY = "Array cannot be empty. ";
 
     // Special cases
     public static final String STREET_NUMBER_MISSING = "Street number is required if street name is provided. ";
     public static final String STREET_NAME_MISSING = "Street name is required if street number is provided. ";
     public static final String STREET_DETAILS_INCOMPLETE = "Both street name and street number must be provided, or neither. ";
     public static final String COMPLETION_DATE_MISSING = "Certificate valid but Completion Date missing. ";
     public static final String COMPLETION_DATE_IN_FUTURE = "Certificate valid but Completion Date is in the future. ";
     public static final String CERTIFICATE_MISSING = "Completion Date valid but Certificate missing. ";
     public static final String OBJECT_NOT_NULL = "%s cannot be null. ";
}