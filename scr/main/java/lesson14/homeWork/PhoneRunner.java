package lesson14.homeWork;

import java.util.*;

public class PhoneRunner {
    public static void main(String[] args) {

// Генерируем список возможных номеров телефонов = contacts
        List<Integer> contacts = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            contacts.add(1000000 + (int) (Math.random() * 9000000));
        }
        contacts.sort(Comparator.naturalOrder());

        System.out.println("База телефонных номеров оператора сотовой связи: +7-999-:");
        System.out.println(contacts);

// Создаем список абонетов: Фамилия + номер = peopleNumber
        List<PeopleList> peopleNumber = new ArrayList<>(50);
        List<Integer> contactsReal = new ArrayList<>(); // задействованные (непустые) номера телефонов
        for (int i = 0; i < 50; i++) {
            int randomIndex1 = new Random().nextInt(contacts.size());
            //System.out.println(contacts.get(randomIndex1));
            peopleNumber.add(new PeopleList(contacts.get(randomIndex1)));
            contactsReal.add(contacts.get(randomIndex1));
            contacts.remove(randomIndex1);
        }

// Дополняем список абонентов контактами = peopleListContact
        Map<PeopleList, List<Integer>> peopleListContact = new LinkedHashMap<>(peopleNumber.size());
        for (PeopleList element : peopleNumber) {
            int randomIndex2 = new Random().nextInt(contactsReal.size());
            int randomIndex3 = new Random().nextInt(contactsReal.size());
            int randomIndex4 = new Random().nextInt(contactsReal.size());
            peopleListContact.put(element, List.of(contactsReal.get(randomIndex2),
                    contactsReal.get(randomIndex3), contactsReal.get(randomIndex4)));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("База абонентов сотового оператора:");
        for (PeopleList key : peopleListContact.keySet()) {
            System.out.println(key + "; Контакты абонента: +7-999-" + peopleListContact.get(key));
        }

// Создаем вспомогательный список из всех используемых номеров в контактах = contactGeneral
        List<Integer> contactsGeneral = new ArrayList<>();
        for (PeopleList key : peopleListContact.keySet()) {
            contactsGeneral.addAll(peopleListContact.get(key));
        }
        contactsGeneral.sort(Comparator.naturalOrder());

// Рассчитываем частоту использования телефонных номеров у разных абонентов = map: номер телефона + частота
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int val = 0;
        for (Iterator<Integer> it = contactsGeneral.iterator(); it.hasNext(); ) {
            if (it.next() == val) {
                count++;
                val = it.next();
                //map.put(val, count);
            } else {
                val = it.next();
                count = 1;
                //map.put(val, count);
            }
            map.put(val, count);

        }
        System.out.println("-------------------------------------------");
        System.out.println("Номер телефона + частота встречаемости в контактах (популярность):");
        System.out.println(map);
        System.out.println("-------------------------------------------");


// Рассчитываем максимальную частоту встречаемости номера у абонентов = k
        int k = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > k) {
                k = map.get(key);
            }
        }

// Вычисляем номера телефонов с максимальной распространенностью
        List<Integer> contactTop = new LinkedList<>(getKeyByValue(map, k));

        // Вычисляем фамилии самых популярных абонентов
        List<PeopleList> peopleTop = new LinkedList<>(getKeyByValue1(peopleNumber, contactTop));
        System.out.println("Самые популярные контакты абонентов - это:");
        System.out.println(peopleTop);
        System.out.println("Каждый из них присутствует в списках контактов " + k + " раз(а)");

    }

    private static List<Integer> getKeyByValue(Map<Integer, Integer> map, Integer searchValue) {
        List<Integer> contactPop = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(searchValue, entry.getValue())) {
                contactPop.add(entry.getKey());
            }
        }
        return contactPop;
    }


    private static List<PeopleList> getKeyByValue1(List<PeopleList> peopleLists, List<Integer> list) {
        List<PeopleList> peoplePop = new ArrayList<>();
        for (Integer tel : list) {
            for (PeopleList people : peopleLists) {
                if (tel.equals(people.getNumberPhone())) {
                    peoplePop.add(people);
                }
            }
        }
        return peoplePop;
    }

}
