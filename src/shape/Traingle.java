package shape;

class Traingle implements Shape{
        private double height;
        private double base ;
        
        private double a;
        private double b ;
        private double c ;

        public Traingle(double height, double base, double a, double b , double c ) {
            this.base  = base ;
            this.height = height;
            this.a =a;
            this.b =b;
            this.c = c;
    }
    
    
    
        public double area() {
            return 0.5 * base *height ;
    }

    public double perimeter() {
               return a + b +c;
    }
}
