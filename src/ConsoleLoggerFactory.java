public class ConsoleLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        Logger logger = new ConsoleLog();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}