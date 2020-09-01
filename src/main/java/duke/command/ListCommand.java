package duke.command;

import duke.Storage;
import duke.Ui;
import duke.task.TaskList;

/**
 * Represents command that is specific to the list command.
 */
public class ListCommand extends Command {

    /**
     * Creates ListCommand object.
     */
    public ListCommand() {
        this.exit = false;
    }

    /**
     * Executes list command by user.
     * @param taskList tasks of user.
     * @param ui user interface object.
     * @param storage Storage object to retrieve and store data from file.
     */
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.showList(taskList.getList());
    }
}
