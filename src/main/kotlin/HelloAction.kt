import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloAction : AnAction("Hello") {
    override fun actionPerformed(event: AnActionEvent) {
        Messages.showMessageDialog("Hello world!", "Greeting", Messages.getInformationIcon())
    }
}