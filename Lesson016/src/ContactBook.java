import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Ограничьте класс ContactBook так, чтобы он мог хранить в себе только список контактов
public class ContactBook <T extends Contact> {
    // Объявите поле класса contacts - список контактов книги
    List<Contact> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        // Выведите на экран весь список контактов книги
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println("Имя: " + contact.name);
            contact.print();
        }

    }

    public void congratulate(String name) {
        boolean contactPresented = false; //проверяем есть ли контакт в базе
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if(Objects.equals(name, contact.name)) {
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
                contactPresented = true;
            }

        }
        if(!contactPresented) {
            System.out.println("Не найден контакт с указанным именем.");
        }

    }

}