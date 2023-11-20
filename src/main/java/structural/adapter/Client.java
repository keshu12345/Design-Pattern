package structural.adapter;

import structural.adapter.adaptee.WeightMachineForBabies;
import structural.adapter.adapter.WeightMachineAdapter;
import structural.adapter.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {

        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImpl(new WeightMachineForBabies());
        double weightInKg=weightMachineAdapter.getWeightInKg();
        System.out.print("Weight in KG : ");
        System.out.println(weightInKg);

    }
}
