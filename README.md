## Работа класса **SalesManager**

### Данный класс использует *массив* данных о продажах, анализирует их и выводит итог:
```java
int max = -1;
        for (int sale : sales) {
        if (sale > max) {
        max = sale;
        }
        }
        return max;
```


