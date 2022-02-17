package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    @Override
    protected Class<?>[] getRootConfigClasses() {
        /*// я добавила в этот метод следующие 3 строки - но Алишев в 16 видео (примерно 9-10 мин)
        // сказал, что этот метод исп. не будем, поэтому он будет возвращать ноль - этот вариант и
        // был в исходном коде - поэтому возвращаю его*/
        /*return new Class<?>[]{
                WebConfig.class
        };*/
        return null;
    }

    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ // у Алишева (16 видео - примерно 10-11 мин) вопроса здесь нет
                WebConfig.class
        };
    }

    /* Данный метод указывает url, на котором будет базироваться приложение */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}