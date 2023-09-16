interface MileConverter {
    double convertMilesToKilometers(double miles);
}

class MileToKilometerAdapter implements MileConverter
{

    @Override
    public double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }
    
}

class main
