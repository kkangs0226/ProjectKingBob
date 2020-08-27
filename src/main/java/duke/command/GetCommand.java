package duke.command;

import duke.Storage;
import duke.task.TaskList;
import duke.DukeException;
import duke.Parser;
import duke.Ui;

public class GetCommand extends Command {

    private String input;

    public GetCommand(String input) {
        this.exit = false;
        this.input = input;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.findTask(Parser.parseDate(input.substring(9)), tasks.getList());
    }

}