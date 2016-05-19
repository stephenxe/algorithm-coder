//猫狗队列
//实现猫狗队列，包含以下方法：add（）可添加猫对象和狗对象，pollAll方法，按照进队顺序依次弹出
//pollDog，按照Dog对象进队顺序依此弹出，pollCat，isEmpty。isDogEmpty，isCatEmpty

//Pet.class
class Pet{
  private String type;

  public Pet(String type){
    this.type=type;
  }

  public String getPetType(){
    return this.type;
  }
}

class Dog extends Pet{
  public Dog(){
    super("Dog");
  }
}

class Cat extends Pet{
  public Dog(){
    super("Cat");
  }
}

//-------------------定义新类计数---------------------

class PetEnterQueue{
  private Pet pet;
  private long count;

  public PetEnterQueue(Pet pet,long count){
    this.pet=pet;
    this.count=count;
  }

  public Pet getPet(){
    return this.pet;
  }

  public long getCount(){
    return this.count;
  }

  public getEnterPetType(){
    return this.pet.getPetType
  }
}

public class DogCatQueue{
  private Queue<PetEnterQueue> dogQ;
  private Queue<PetEnterQueue> catQ;
  private long count;
  public DogCatQueue(){
    this.dogQ = new Queue<PetEnterQueue>();
    this.catQ = new Queue<PetEnterQueue>();
    this.count=0;
  }

  public void add(Pet pet){
    if (pet.getPetType().equals("dog")) {
      this.dogQ.add(new PetEnterQueue(pet,this.count++));
    }else if (pet.getPetType().equals("cat")) {
      this.catQ.add(new PetEnterQueue(pet,this.count++));
    }else{
      throw new RuntimeException("err, not dog or cat.");
    }
  }

  public Pet pollAll(){
    if (!this.dogQ.isEmpty()&&!catQ.isEmpty()) {
      if (this.dogQ.peek().getCount()<this.catQ.peek).getCount()) {
        return this.dogQ.poll().getPet();
      }else{
        return this.catQ.poll().getPet();
      }
    }else if (!this.dogQ.isEmpty()) {
      return this.dogQ.poll().getPet();
    }else if (!this.catQ.isEmpty()){
      return this.catQ.poll().getPet();
    }else{
      throw new RuntimeException("err, queue is empty.")
    }
  }

  public Dog pollDog(){
    if(!this.dogQ.isEmpty()){
      return (Dog)this.dogQ.poll().getPet();
    }else{
      throw new RuntimeException("Dog queue is empty.");
    }
  }
  public Cat pollCat(){
    if(!this.catQ.isEmpty()){
      return (Cat)this.catQ.poll().getPet();
    }else{
      throw new RuntimeException("Cat queue is empty.");
    }
  }

  public boolean isEmpty(){
    return this.dogQ.isEmpty()&&this.catQ.isEmpty();
  }

  public boolean isDogQueueEmpty(){
    return this.dogQ.isEmpty();
  }

  public boolean isCatQueueEmpty(){
    return this.catQ.isEmpty();
  }
}
