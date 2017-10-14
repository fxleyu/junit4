# JUnit 4 学习项目

本项目中会加一些中文注释以及打印信息，为了更方便的学习 JUnit 4 项目源码。


**代码运行方法**：
- 运行源码文件夹`src/test/fxleyu`下的CalculatorTest.java
- 把生成在`bin`文件夹下的.class文件（Calculator.class 和 CalculatorTest.class）copy到项目跟目录下。
- 添加运行源码文件夹`src/test/fxleyu`下的`org.junit.runner.JUnitCore.main`的运行参数（右键 > Run As > Run Configurations > Arguments > 添加“CalculatorTest”）
- 运行`org.junit.runner.JUnitCore.main`