class Animal {
  public String mName;
  public String mSpecies;
  public String mSex;
  public int mAge;
  public boolean mAdopted;

  public Animal(String name, String species, String sex, int age, boolean adopted) {
    mName = name;
    mSpecies = species;
    mSex = sex;
    mAge = age;
    mAdopted = adopted;
  }

  public boolean adoptedYet(){
    return mAdopted;
  }

}
