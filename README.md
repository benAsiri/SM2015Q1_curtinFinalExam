# SM2015Q1_Sample Answers

This answer might be not right for you if you are not woring out by yourself. Please find your own way.

## Question 1 - SM

Using the Java reflection API, write a method that:
• Takes the name of a subclass as a string parameter;
• Reports any methods in any superclass whose parameter/return types include
the subclass specified. Report each such method once only.
For example, consider the following code:

```
public class ClassA
{
  public String method1(ClassC x) {...}
  public ClassC method2(ClassC x, Class C y) {...}
  public void method3(int x) {...}
}

public class ClassB extends ClassA
{
  public ClassC method4() {...}
}

public class ClassC extends ClassB {...}
```
When passed “ClassC” as a parameter, your method should report ClassA.method1,
ClassA.method2, and ClassB.method4 (all of which have declarations referring back
to ClassC).
The order doesn’t matter, and you may ignore exception handling.
Refer to the following method signatures as required:

• java.lang.Class:
```
String getName();
Class forName(String);
Method getMethod(String, Object...);
Method[] getMethods();
Class getSuperclass();
Class asSubclass(Class);
```

java.lang.reflect.Method:
```
String getName();
boolean isAccessible();
Class[] getParameterTypes();
Class getReturnType();
```


## Authors

* **Dileepa** - *Initial work* - [dsrajapaksa](https://github.com/dsrajapaksa)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

