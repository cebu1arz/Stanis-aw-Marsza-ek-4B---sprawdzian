package workshop;

public class Worker {
    public static void main(String[] args) {
        Tool[] tools = {new Tool("Młot płot,"), new Tool("Młot pneumatyczny,"), new Tool("betoniarka")};

        for (Tool tool : tools) {
            tool.useTool();
        }
    }
}