package edu.yaksha.superCricketer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class Main 
{
	private static int avgCalculation(int firstScore,int secondScore)
	{
		return ((firstScore+secondScore)/2);
	}
    public static void main( String[] args )
    {
    	  Scanner scanner=new Scanner(System.in);
    	  List<Cricketer> cricketerList=new ArrayList<Cricketer>();
    	  for(int i=0;i<11;i++)
    	  {
    		  System.out.println("Enter details of Cricketer no "+(i+1));
    		  String player=scanner.nextLine();
    		  String cricketerArr[]=player.split(",");
    		  int runFirst=Integer.parseInt(cricketerArr[1]);
    		  int runSecond=Integer.parseInt(cricketerArr[2]); 
    		  int avgRun=avgCalculation(runFirst,runSecond);
    		  int wicketFirst=Integer.parseInt(cricketerArr[3]);
    		  int wicketSecond=Integer.parseInt(cricketerArr[4]);
    		  int avgWicket=avgCalculation(wicketFirst,wicketSecond);
    		  Cricketer cricketer=new Cricketer(cricketerArr[0], runFirst, runSecond, avgRun, wicketFirst, wicketSecond, avgWicket);
    		  cricketerList.add(cricketer);
    	  }
    	  Stream<Cricketer> stream1=cricketerList.stream();
    	  Stream<Cricketer> stream2=cricketerList.stream();
    	  Stream<Cricketer> stream3=cricketerList.stream();
    	  Stream<Cricketer> superBatsman=stream1.filter(cricketer->cricketer.getAvgRun()>=50 && cricketer.getAvgWicket()<3);
    	  Stream<Cricketer> superBowler=stream2.filter(cricketer->cricketer.getAvgRun()<50 && cricketer.getAvgWicket()>=3);
    	  Stream<Cricketer> superRounder=stream3.filter(cricketer->cricketer.getAvgRun()>=50 && cricketer.getAvgWicket()>=3);
    	  System.out.println("The Super Batsmans :");
  		superBatsman.collect(Collectors.toList()).forEach(System.out::println);
  	  System.out.println("The Super Bowlers :");
		superBowler.collect(Collectors.toList()).forEach(System.out::println);
		  System.out.println("The Super All Rounder :");
	  		superRounder.collect(Collectors.toList()).forEach(System.out::println);
    	  
    	  
    	  
    }
}
