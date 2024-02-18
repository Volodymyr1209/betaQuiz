package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List <QuestionsList> europeQuestions() {

        final List <QuestionsList> questionsList =new ArrayList<>();

        final QuestionsList questions1 =new QuestionsList("Яке місто є столицею України?",
                "a) Осло","b) Берлін","c) Варшава","d) Київ",
                "d) Київ", "");

        final QuestionsList questions2 =new QuestionsList("Яка річка є найбільшою в Німеччині?",
                "a) Волга","b) Рейн","c) Сена","d) Дунай",
                "b) Рейн", "");

        final QuestionsList questions3 =new QuestionsList("Який гірський хребет розташований в Норвегії?",
                "a) Скандинавські гори","b) Карпати","c) Альпи","d) Уральські гори",
                "c) Альпи", "");

        final QuestionsList questions4 =new QuestionsList("Як називається український національний танець?",
                "a) Вальс","b) Гопак","c) Фламенко","d) Чічітка",
                "b) Гопак", "");

        final QuestionsList questions5 =new QuestionsList("Який український письменник отримав Нобелівську премію з літератури?",
                "a) Тарас Шевченко","b) Іван Франко","c) Леся Українка","d) Олесь Гончар",
                "a) Тарас Шевченко", "");

        final QuestionsList questions6 =new QuestionsList("Яке німецьке місто славиться своїм фестивалем пива Октоберфест?",
                "a) Берлін","b) Мюнхен","c) Франкфурт","d) Гамбург",
                "b) Мюнхен", "");

        final QuestionsList questions7 =new QuestionsList("Яке озеро є найбільшим в Норвегії?",
                "a) Магглун","b) Женевське","c) Волга","d) Мьелар",
                "a) Магглун", "");

        final QuestionsList questions8 =new QuestionsList("Яка українська страва вважається національним символом?",
                "a) Борщ","b) Вареники","c) Сало","d) Голубці",
                "a) Борщ", "");

        final QuestionsList questions9 =new QuestionsList("Яке місто в Україні славиться своїм льодовим печерами?",
                "a) Кам'янець-Подільський","b) Луцьк","c)  Львів","d)  Київ",
                "c)  Львів", "");

        final QuestionsList questions10 =new QuestionsList("Який німецький місто є найбільшим за площею?",
                "a)  Гамбург","b) Мюнхен","c) Франкфурт","d) Берлін",
                "d) Берлін", "");


        questionsList.add(questions1);
        questionsList.add(questions2);
        questionsList.add(questions3);
        questionsList.add(questions4);
        questionsList.add(questions5);
        questionsList.add(questions6);
        questionsList.add(questions7);
        questionsList.add(questions8);
        questionsList.add(questions9);
        questionsList.add(questions10);
        return questionsList;
    }

    private static List <QuestionsList> ukraineQuestions() {

                final List <QuestionsList> questionsList =new ArrayList<>();

                final QuestionsList questions1 =new QuestionsList("Яка найбільша річка в Україні?",
                        "a) Дніпро","b) Дністер","c) Десна","d) Прут",
                        "a) Дніпро", "");

                final QuestionsList questions2 =new QuestionsList("Яке найбільше місто України за кількістю населення?",
                        "a) Дніпро","b) Харків","c) Одеса","d) Київ",
                        "d) Київ", "");

                final QuestionsList questions3 =new QuestionsList("Яка культурна спадщина України внесена до списку світової спадщини ЮНЕСКО?",
                        "a) Софія Київська","b) Почаївська лавра","c) Замок Львів","d) Херсонес Таврійський",
                        "b) Почаївська лавра", "");

                final QuestionsList questions4 =new QuestionsList("Який український письменник отримав Нобелівську премію з літератури?",
                        "a) Іван Франко","b) Леся Українка","c) Тарас Шевченко","d) Олесь Гончар",
                        "a) Іван Франко", "");

                final QuestionsList questions5 =new QuestionsList("Як називається українське національне вишиване плаття?",
                        "a) Сорочка","b) Літня сукня","c) Вишиванка","d) Футболка",
                        "c) Вишиванка", "");

                final QuestionsList questions6 =new QuestionsList("Яка українська страва вважається національним символом?",
                        "a) Борщ","b) Вареники","c) Сало","d) Голубці",
                        "a) Борщ", "");

                final QuestionsList questions7 =new QuestionsList("Який символ прикрашає прапор України?",
                        "a) Борщ","b) Тризуб","c) Лелека","d) Сонце",
                        "b) Тризуб", "");

                final QuestionsList questions8 =new QuestionsList("Яка країна стала гарантом безпеки України за Будапештським меморандумом 1994 року?",
                        "a) США","b) Велика Британія","c) Франція","d) росія",
                        "a) США", "");

                final QuestionsList questions9 =new QuestionsList("Яке українське місто вважається морозним?",
                        "a) Івано-Франківськ","b) Луцьк","c) Чернігів","d) Львів",
                        "d) Львів", "");

                final QuestionsList questions10 =new QuestionsList("Яка назва мала українська держава, яка існувала в середньовіччі?",
                        "a)  Галицько-Волинська держава","b) Київська Русь","c) Запорізька Січ","d) Козацька Річ Посполита",
                        "b) Київська Русь", "");


                questionsList.add(questions1);
                questionsList.add(questions2);
                questionsList.add(questions3);
                questionsList.add(questions4);
                questionsList.add(questions5);
                questionsList.add(questions6);
                questionsList.add(questions7);
                questionsList.add(questions8);
                questionsList.add(questions9);
                questionsList.add(questions10);
                return questionsList;
            }

    private static List <QuestionsList> germanyQuestions() {
        final List <QuestionsList> questionsList =new ArrayList<>();

        final QuestionsList questions1 =new QuestionsList("Яка столиця Німеччини?",
                "a) Берлін","b) Париж","c) Лондон","d) Рим",
                "a) Берлін", "");

        final QuestionsList questions2 =new QuestionsList("Яке місто Німеччини вважається містом на ріці Рейн?",
                "a) Франкфурт","b) Мюнхен","c) Кельн","d) Гамбург",
                "c) Кельн", "");

        final QuestionsList questions3 =new QuestionsList("Яка автомобільна компанія є найбільшою в Німеччині?",
                "a) Audi","b) BMW","c) Volkswagen","d) Mercedes-Benz",
                "b) BMW", "");

        final QuestionsList questions4 =new QuestionsList("Який футбольний клуб є найуспішнішим у Німеччині?",
                "a) Баварія Мюнхен","b) Борусія Дортмунд","c) Штутгарт","d) РБ Лейпциг",
                "a) Баварія Мюнхен", "");

        final QuestionsList questions5 =new QuestionsList("Який німецький місто славиться своїм щорічним фестивалем пива Октоберфест?",
                "a) Франкфурт","b) Гамбург","c) Берлін","d) Мюнхен",
                "d) Мюнхен", "");

        final QuestionsList questions6 =new QuestionsList("Який замок в Німеччині вважається символом силового об’єднання країни?",
                "a) Замок Людвігсбург","b) Замок Гейдельберг","c)  Замок Нойшванштайн","d) Замок Вартбург",
                "c)  Замок Нойшванштайн", "");

        final QuestionsList questions7 =new QuestionsList("Який урядовий орган є найвищим у Німеччині?",
                "a) Федеральна рада","b) Федеральний президент","c) Федеральний канцлер","d) Федеральний суд",
                "b) Федеральний президент", "");

        final QuestionsList questions8 =new QuestionsList("Яке німецьке місто вважається містом багаття?",
                "a) Гамбург","b) Штутгарт","c) Мюнхен","d) Лейпциг",
                "a) Гамбург", "");

        final QuestionsList questions9 =new QuestionsList("Яка німецька авіакомпанія є найбільшою за кількістю пасажирів?",
                "a) EasyJet","b) Ryanair","c) Air Berlin","d) Lufthansa",
                "d) Lufthansa", "");

        final QuestionsList questions10 =new QuestionsList("Яка ріка є найбільшою в Німеччині?",
                "a)  Дунай","b) Рейн","c) Ельба","d) Волга",
                "b) Рейн", "");


        questionsList.add(questions1);
        questionsList.add(questions2);
        questionsList.add(questions3);
        questionsList.add(questions4);
        questionsList.add(questions5);
        questionsList.add(questions6);
        questionsList.add(questions7);
        questionsList.add(questions8);
        questionsList.add(questions9);
        questionsList.add(questions10);
        return questionsList;

    }

    private static List <QuestionsList> norwayQuestions() {
        final List <QuestionsList> questionsList =new ArrayList<>();

        final QuestionsList questions1 =new QuestionsList("Яка столиця Норвегії?",
                "a) Стокгольм","b) Осло","c) Копенгаген","d) Хельсінкі",
                "b) Осло", "");

        final QuestionsList questions2 =new QuestionsList("Яка найвища гора в Норвегії?",
                "a) Гальхьопигген","b) Ян Майен","c) Снігут","d) Трольтінда",
                "a) Гальхьопигген", "");

        final QuestionsList questions3 =new QuestionsList("Як називається традиційний норвезький національний одяг?",
                "a) Сарі","b) Кімоно","c) Чедрі","d) Бунад",
                "d) Бунад", "");

        final QuestionsList questions4 =new QuestionsList("Яка найбільша річка в Норвегії?",
                "a) Фьорд","b) Драгсвол","c) Нільс","d) Гломма",
                "d) Гломма", "");

        final QuestionsList questions5 =new QuestionsList("Яке найпопулярніше норвезьке місто для огляду північного сяйва?",
                "a) Берген","b) Осло","c) Тромсе","d) Ставангер",
                "c) Тромсе", "");

        final QuestionsList questions6 =new QuestionsList("Яке місто в Норвегії відоме своїми дерев'яними будинками бергенського стилю?",
                "a) Берген","b) Осло","c)  Тронхейм","d) Ставангер",
                "a) Берген", "");

        final QuestionsList questions7 =new QuestionsList("Яка риба в Норвегії є символом країни?",
                "a) Тунець","b) Лосось","c) Шпрот","d) Морська форель",
                "b) Лосось", "");

        final QuestionsList questions8 =new QuestionsList("Яке норвезьке слово означає затока або затишне місце?",
                "a) Бухта","b) Лиман","c) Фельд","d) Фіорд",
                "d) Фіорд", "");

        final QuestionsList questions9 =new QuestionsList("Яка країна знаходиться на південному сході від Норвегії?",
                "a) Швеція","b) Фінляндія","c) Данія","d) Ісландія",
                "a) Швеція", "");

        final QuestionsList questions10 =new QuestionsList("Який фіорд вважається найглибшим у Норвегії та світі?",
                "a)  Согнефьорд","b) Гейрангерфьорд","c) Хардангерфьорд","d) Норд-Фьорд",
                "a)  Согнефьорд", "");


        questionsList.add(questions1);
        questionsList.add(questions2);
        questionsList.add(questions3);
        questionsList.add(questions4);
        questionsList.add(questions5);
        questionsList.add(questions6);
        questionsList.add(questions7);
        questionsList.add(questions8);
        questionsList.add(questions9);
        questionsList.add(questions10);
        return questionsList;

    }



    public static List<QuestionsList> qetQuestions (String selectedTopicName){
        switch (selectedTopicName){
            case "europe" : return europeQuestions();
            case "ukraine" : return ukraineQuestions();
            case "germany" : return germanyQuestions();
            default:return norwayQuestions();
        }
    }
}
