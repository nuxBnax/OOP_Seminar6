2) Создать систему управления библиотекой(SOLID)

a)    Book - должен отвечать только за хранение информации о книге. (единственная ответственность
-> Single Responsibility Principle)

b)    Genre - должен хранить информацию о жанрах книг. (открыт для расширения, но закрыт для
изменения -> Open-Closed Principle)

c)    ElectronBook - должна иметь формат чтения и размер. (Принцип подстановки Барбары Лисков - >
Liskov Substitution Principle)

d)    Searchable - должен производить поиск по авторам книг. (Принцип разделения интерфейса ->
Interface Segregation Principle)

e)    Formatter - должен выводить информацию в различных форматах( без формата,json,html)-
заглушки (Принцип инверсии зависимостей -> Dependency Inversion Principle)