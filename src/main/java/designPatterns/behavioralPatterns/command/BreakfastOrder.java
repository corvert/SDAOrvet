package designPatterns.behavioralPatterns.command;

public class BreakfastOrder implements Order{

    private CookingStaff cookingStaff;

    public BreakfastOrder(CookingStaff cookingStaff) {
        this.cookingStaff = cookingStaff;
    }

    @Override
    public void execute() {
        cookingStaff.cookBreakfast();
    }
}
