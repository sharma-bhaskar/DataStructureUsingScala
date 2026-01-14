package com

import org.omg.CORBA.portable.IDLEntity

/**
  * Question2:
  * You are given two sets of data: Ordering Rules and Updates.
  *
  * For example:
  *
  * 47|53
  * 97|13
  * 97|61
  * 97|47
  * 75|29
  * 61|13
*75|53
*29|13
*97|29
*53|29
*61|53
*97|53
*61|29
*47|13
*75|47
*97|75
*47|61
*75|61
*47|29
*75|13
*53|13
 *
 *
 *//
*Parser of rule page Ordering A|B
 *
 *type rule = (int, int)
*1. check the page ordering
*Parse(47|53) return = (47 ,53)
 *
 *2. list of
*ParserUpdate( )  :List[Int]  =  List(75,47,61,53,29)
 *
 *3. Apply Rule
 *
 *List(75,47,61,53,29)
 *
 *4. validation
 *
 *isValidation(rules, update)
 *
 *Map[page -> index]
 *
 *5.
*rule (a ,b) pos and if the pos(a) < pos(b)
 *
 *postMap  == {76--1} {62--1}
 *
 *rules.forAll{
*case(a,b) = >
*(postMap.get(a), postMap.get(b)) match {
  *case (Some(i),Some(j)) =>  i < j
*}
*}
 *
 *6 incorrect order
  *updateIncorrect(rules, update)
 *
 *
 *val lis
 *
 *//
*75,47,61,53,29
*97,61,53,29,13
*75,29,13
*75,97,47,61,53
*61,13,29
*97,13,75,29,47
*The first section specifies the page ordering rules, one per line. The first rule, 47|53, means that if an update includes both page number 47 and page number 53, then page number 47 must be printed at some point before page number 53. (47 doesn't necessarily need to be immediately before 53; other pages are allowed to be between them.)
 *
 *The second section specifies the page numbers of each update. The first update, 75,47,61,53,29, means that the update consists of page numbers 75, 47, 61, 53, and 29.
 *
 *In the above example, the first update (75,47,61,53,29) is in the right order:
 *
 *75 is correctly first because there are rules that put each other page after it: 75|47, 75|61, 75|53, and 75|29.
*47 is correctly second because 75 must be before it (75|47) and every other page must be after it according to 47|61, 47|53, and 47|29.
*61 is correctly in the middle because 75 and 47 are before it (75|61 and 47|61) and 53 and 29 are after it (61|53 and 61|29).
*53 is correctly fourth because it is before page number 29 (53|29).
*29 is the only page left and so is correctly last.
*Because the first update does not include some page numbers, the ordering rules involving those missing page numbers are ignored.
 *
 *The second and third updates are also in the correct order according to the rules. Like the first update, they also do not include every page number, and so only some of the ordering rules apply - within each update, the ordering rules that involve missing page numbers are not used.
 *
 *The fourth update, 75,97,47,61,53, is not in the correct order: it would print 75 before 97, which violates the rule 97|75.
 *
 *The fifth update, 61,13,29, is also not in the correct order, since it breaks the rule 29|13.
 *
 *The last update, 97,13,75,29,47, is not in the correct order due to breaking several rules.
  *
  * */
object TestTDD extends App {
  //Designing an Elevator System

  // functional
  // Elevator Up/Down
  // Destination to chase 1, or any -- N
  // open/close doors
  // call scheduling for destination

  // non func
   //1. safety
   //2. phone call, number of person based on the weight
   //3. Scalability based on the concurrency -- number of request
   //4. scheduling logic


  // core modeling

  object Constant {
    enum Direction = UP, DOWN, IDLE
    enum DoorState = Close , open
    enum ElevatorState = MOVING, STOPPED, OUT_OF_SCOPE
  }

  trait {
    def Floor(int number)
    def RequestElev(int floor,Direction dir)

  }
  //


  boolean isAvailable() {

  }

  def addStop: Unit = {

  }
  def nextStop: Unit = {

  }

  def arrivedAtGroundFloor = {

  }


  schedulingLogic -- Assign based on

  DS -- TrieMap or Vector

  int maxVale = MAX.VALUE

  for(CAR) {
    if(car.isAvailable)
    else {
      int serve = car.isservebased(request)

      serve
    }
  }


  class Elvet{
    val currentFloor = 0

    val directionStat = Direction.Idel
    val doorSTate = DOOR.Close
    val stateOfEleve = EVEL.STOPPED


    private implicit val asc = Ordering.Int

    private implicit val desc = Ordering.Int.reverse

    private val upStop = TreeSet.empty[asc]
    private val downStop = TreeSet.empty[desc]

    def Floor : Int   = currentFloor
    def door = direc

  }



















}
