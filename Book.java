package com.example.demo.api.model;

public class Book {

        private String author;
        private String book;
        private String synopsis;
        private int id;

        public Book(String author, String book, String synopsis, int id){
            this.author = author;
            this.book = book;
            this.synopsis = synopsis;
            this.id = id;
        }

        public String getAuthor(){
            return author;
        }

        public String getBook(){
            return book;
        }

        public String getSynopsis(){
            return sysnopsis;
        }

        public int getId(){
            return id;
        }


        public void setAuthor(String author) {
            this.author = author;
        }

        public void setBook(String book) {
            this.book = book;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public void setId(int id) {
            this.id = id;
        }
        // {
        //   "author": "Lara Brighton",
        //   "title": "Whispers in the Mist",
        //   "synopsis": "A mysterious fog envelops a small town, bringing with it secrets long forgotten.",
        //   "release_date": "2022-05-17",
        //   "id": 1
        // }
        // {
        //   "author": "Mark Donovan",
        //   "title": "The Last Frontier",
        //   "synopsis": "An interstellar adventure exploring the uncharted regions of space where danger lurks behind every star.",
        //   "release_date": "2021-09-12",
        //   "id": 2
        // }
        // {
        //   "author": "Sophia Li",
        //   "title": "The Blossom's Fall",
        //   "synopsis": "In a world where seasons never change, a rebellion rises to bring the forgotten autumn back to life.",
        //   "release_date": "2023-02-25",
        //   "id": 3
        // }
        // {
        //   "author": "David Carlson",
        //   "title": "Echoes of the Past",
        //   "synopsis": "A historian uncovers a hidden conspiracy stretching back centuries that threatens the present.",
        //   "release_date": "2020-11-04",
        //   "id": 4
        // }
        // {
        //   "author": "Priya Gupta",
        //   "title": "Wings of Freedom",
        //   "synopsis": "A coming-of-age story about a young girl determined to break free from the confines of her strict upbringing.",
        //   "release_date": "2019-07-21",
        //   "id": 5
        // }
        // {
        //   "author": "Joshua Green",
        //   "title": "Under the Crimson Sky",
        //   "synopsis": "Two rivals must team up to survive in a world where the sun never sets, and the night never comes.",
        //   "release_date": "2024-03-14",
        //   "id": 6
        // }
        // {
        //   "author": "Emily Rivers",
        //   "title": "The Silent Depths",
        //   "synopsis": "A deep-sea expedition uncovers more than just marine life, leading to an unimaginable discovery.",
        //   "release_date": "2023-06-10",
        //   "id": 7
        // }
        // {
        //   "author": "Xavier Montague",
        //   "title": "Shadows of the Lost Kingdom",
        //   "synopsis": "An ancient kingdom reappears, and an unlikely hero must navigate its dark corridors to uncover its secrets.",
        //   "release_date": "2022-10-30",
        //   "id": 8
        // },
        // {
        //   "author": "Rebecca Hale",
        //   "title": "Tides of Fate",
        //   "synopsis": "Set against the backdrop of a crumbling empire, two friends find themselves on opposite sides of a brewing civil war.",
        //   "release_date": "2021-08-19",
        //   "id": 9
        // },
        // {
        //   "author": "Derek Shaw",
        //   "title": "The Eternal Hunt",
        //   "synopsis": "In a world where time is currency, a bounty hunter races against the clock to save a loved one.",
        //   "release_date": "2020-01-05",
        //   "id": 10
        // }

}
