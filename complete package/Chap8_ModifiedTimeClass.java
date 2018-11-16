public class Chap8_ModifiedTimeClass {

        private int hour; // 0 - 23
        private int minute; // 0 - 59
        private int second; // 0 - 59

        // Time2 no-argument constructor:
        // initializes each instance variable to zero
        public Chap8_ModifiedTimeClass()
        {
            this(0, 0, 0); // invoke constructor with three arguments
        }

        // Time2 constructor: hour supplied, minute and second defaulted to 0
        public Chap8_ModifiedTimeClass(int hour)
        {
            this(hour, 0, 0); // invoke constructor with three arguments
        }

        // Time2 constructor: hour and minute supplied, second defaulted to 0
        public Chap8_ModifiedTimeClass(int hour, int minute)
        {
            this(hour, minute, 0); // invoke constructor with three arguments
        }

        // Time2 constructor: hour, minute and second supplied
        public Chap8_ModifiedTimeClass(int hour, int minute, int second)
        {
            if (hour < 0 || hour >= 24)
                throw new IllegalArgumentException("hour must be 0-23");

            if (minute < 0 || minute >= 60)
                throw new IllegalArgumentException("minute must be 0-59");

            if (second < 0 || second >= 60)
                throw new IllegalArgumentException("second must be 0-59");

            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        // Time2 constructor: another Time2 object supplied
        public Chap8_ModifiedTimeClass(Chap8_ModifiedTimeClass time)
        {
            // invoke constructor with three arguments
            this(time.getHour(), time.getMinute(), time.getSecond());
        }

        // Set Methods
        // set a new time value using universal time;
        // validate the data
        public void setTime(int hour, int minute, int second)
        {
            if (hour < 0 || hour >= 24)
                throw new IllegalArgumentException("hour must be 0-23");

            if (minute < 0 || minute >= 60)
                throw new IllegalArgumentException("minute must be 0-59");

            if (second < 0 || second >= 60)
                throw new IllegalArgumentException("second must be 0-59");

            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        // validate and set hour
        public void setHour(int hour)
        {
            if (hour < 0 || hour >= 24)
                throw new IllegalArgumentException("hour must be 0-23");

            this.hour = hour;
        }

        // validate and set minute
        public void setMinute(int minute)
        {
            if (minute < 0 || minute >= 60)
                throw new IllegalArgumentException("minute must be 0-59");

            this.minute = minute;
        }

        // validate and set second
        public void setSecond(int second)
        {
            if (second < 0 || second >= 60)
                throw new IllegalArgumentException("second must be 0-59");

            this.second = second;
        }

        // Get Methods
        // get hour value
        public int getHour()
        {
            return hour;
        }

        // get minute value
        public int getMinute()
        {
            return minute;
        }

        // get second value
        public int getSecond()
        {
            return second;
        }

        // convert to String in universal-time format (HH:MM:SS)
        public String toUniversalString()
        {
            return String.format("%d Seconds", getHour() * 3600 + getMinute() * 60 + getSecond());
        }

        // convert to String in standard-time format (H:MM:SS AM or PM)
        public String toString()
        {
            return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
        }
    } // end class Time2