import org.apache.log4j.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(add(1, 5));
    }

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static int add(int a, int b) {
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setThreshold(Level.INFO);
        consoleAppender.setLayout(new PatternLayout("%d [%p|%c|%c{1}"));
        consoleAppender.activateOptions();
        LogManager.getRootLogger().addAppender(consoleAppender);

        logger.debug("this is debug message");
        logger.info("this is an info message");
        int c = 0;
        String anyID = "100";
        try {
            c = a + b;
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }

        logger.debug("this is debug message");
        logger.info("this is an info message");

        return c;
    }

}
