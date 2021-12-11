public class UserValidator {
    private final Validator validator;

    public UserValidator(Validator validator){
        this.validator = validator;
    }

    public boolean isValidUser(User user) {
        return validator.isUserValid(user);
    }

//    @Override
//    public boolean isUserValid(User user) {
//        return !user.getFirstName().isBlank() && !user.getLastName().isBlank();
//    }

}
