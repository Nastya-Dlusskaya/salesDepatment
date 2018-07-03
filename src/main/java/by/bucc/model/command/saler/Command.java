package by.bucc.model.command.saler;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface Command {
    void execute(ServletRequest request, ServletResponse response);
}
