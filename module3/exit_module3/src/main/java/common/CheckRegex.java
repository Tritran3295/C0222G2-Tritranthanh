//package common;
//
//import model.customer.customer.Customer;
//import service.customer.CustomerServiceImpl;
//import service.customer.ICustomerService;
//import service.customerType.CustomerTypeServiceImpl;
//import service.customerType.ICustomerTypeService;
//import service.employee.EmployeeServiceImpl;
//import service.employee.IEmployeeService;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class CheckRegex {
//    private static ICustomerTypeService iCustomerTypeService = new CustomerTypeServiceImpl();
//    private static IEmployeeService iEmployeeService = new EmployeeServiceImpl();
//    private static ICustomerService iCustomerService = new CustomerServiceImpl();
//    public static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
//    public static final String ID_CARD = "^[0-9]{9}|[0-9]{12}$";
//    public static final String NUMBER_PHONE = "^090[0-9]{7}|091[0-9]{7}|(84)\\+90[0-9]{7}|(84)\\+91[0-9]{7}$";
//    public static final String SALARY = "^[0-9]*[0-9][\\\\.]?[0-9]*$";
//
//
//
//    public static Map<String,String> regexEmail(String email){
//        Map<String,String> errors = new HashMap<>();
//        if(email.equals("")){
//            errors.put("email","Email is not null.");
//        }else if (!email.matches(EMAIL_REGEX)){
//            errors.put("email","Email is invalid");
//        }return errors;
//    }
//    public static Map<String, String> regexName(String name) {
//        Map<String, String> errors = new HashMap<>();
//        if (name.equals("")) {
//            errors.put("name", "Name is not null.");
//        }
//        return errors;
//
//    }
//    public static Map<String, String> regexBirthday(String position) {
//        Map<String, String> errors = new HashMap<>();
//        if (position.equals("")) {
//            errors.put("birthday", "Birthday is not null.");
//        }
//        return errors;
//    }
//    public static Map<String, String> regexIdCard(String idCard) {
//        Map<String, String> errors = new HashMap<>();
//        if (idCard.equals("")) {
//            errors.put("idCard", "ID Card is not null.");
//        } else if (!idCard.matches(ID_CARD)) {
//            errors.put("idCard", "CMND 9 or 12 số bạn ơi!.");
//        }
//        return errors;
//    }
//    public static Map<String,String> regexNumberPhone(String numberphone){
//        Map<String,String> errors = new HashMap<>();
//
//        List<Customer> customerList = iCustomerService.selectAllCustomer();
//
//        boolean checkPhoneAlreadyExist = false;
//
//        for (Customer customer : customerList){
//            if(customer.getPhoneNumber().equals(numberphone)){
//                checkPhoneAlreadyExist = true;
//                break;
//            }
//
//        }if (numberphone.equals("")){
//            errors.put("numberPhone","Number Phone is not null");
//        }
//        else if (!numberphone.matches(NUMBER_PHONE)){
//            errors.put("numberPhone","SĐT bắt đầu 09 và 10 số bạn ơi!");
//        }
//        return errors;
//    }
//
//    public static Map<String,String> regexSalary(String salary){
//        Map<String,String> errors = new HashMap<>();
//        if (salary.equals("")){
//            errors.put("salary","salary is not null");
//        }else if (salary.matches(SALARY)){
//            errors.put("salary","salary is not null");
//        }
//        return errors;
//    }
//}
