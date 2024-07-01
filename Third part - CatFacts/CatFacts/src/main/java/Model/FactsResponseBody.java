package Model;

import java.util.ArrayList;

public class FactsResponseBody{
        public int current_page;
        public ArrayList<Datum> data;
        public String first_page_url;
        public int from;
        public int last_page;
        public String last_page_url;
        public ArrayList<Link> links;
        public String next_page_url;
        public String path;
        public int per_page;
        public Object prev_page_url;
        public int myto;
        public int total;

        public class Datum{
            public String fact;
            public int length;
        }

        public class Link{
            public String url;
            public String label;
            public boolean active;
        }
    }

