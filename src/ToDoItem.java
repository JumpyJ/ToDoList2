public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem (String description)
    {
        this.description = description;
        isDone = false;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String newDescription)
    {
        this.description = newDescription;
    }

    public boolean getIsDone()
    {
        return this.isDone;
    }

    public void setIsDone(boolean newIsDone)
    {
        this.isDone = newIsDone;
    }
}