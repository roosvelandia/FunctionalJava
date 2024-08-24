package lesson7.BehaviouralPattern;

public class ACAutomationRemote {

        private CommandI command;

        public void setCommand(CommandI command) {
            this.command = command;
        }

        public void buttonPressed() {
            command.execute();
        }
}
