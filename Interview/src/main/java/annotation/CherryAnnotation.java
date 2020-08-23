package annotation;

import java.lang.annotation.*;

/**
 * Target:
 *
 * @Target说明了Annotation所修饰的对象范围： Annotation可被用于 packages、 types（类、
 * 接口、枚举、 Annotation 类型）、类型成员（方法、构造方法、成员变量、枚举值）、方法参数
 * 和本地变量（如循环变量、 catch 参数）
 */
@Target(value = {ElementType.ANNOTATION_TYPE})

/**
 * Retention 定义了该 Annotation 被保留的时间长短：表示需要在什么级别保存注解信息，用于描
 * 述注解的生命周期（即：被描述的注解在什么范围内有效），取值（RetentionPoicy）由：
 * SOURCE:在源文件中有效（即源文件保留）
 * CLASS:在 class 文件中有效（即 class 保留）
 * RUNTIME:在运行时有效（即运行时保留）
 */
@Retention(RetentionPolicy.RUNTIME)

/**
 *
 */
@Documented

/**
 * @Inherited 元注解是一个标记注解，
 * @Inherited 阐述了某个被标注的类型是被继承的
 */
@Inherited

/**
 * 提取注解方式:java.lang.reflect.AnnotatedElement
 */
public @interface CherryAnnotation {

}
