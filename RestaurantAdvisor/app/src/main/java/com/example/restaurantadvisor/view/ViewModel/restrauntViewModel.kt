package com.example.restaurantadvisor.view.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restaurantadvisor.model.restaurant

class restrauntViewModel:ViewModel() {

    val restrauntListLivedata = MutableLiveData<ArrayList<restaurant>>()

    fun populatedata(){
        val r1= restaurant("Oriental Spice","Ghodbandar Road, Thane.","Talumein Soup, Fortune Rice, Chilly Garlic Vegetables",4)
        val r2=restaurant("Pop Tate's","R Mall, LBS Marg, Mulund West, Mumbai.","Chicken Lasagne, Prawns Chilli",4)
        val r3=restaurant("Stomach","Versova, Andheri West.","Chicken Fried Rice, Chicken Hunan",3)
        val r4= restaurant("Stomach","Linking Road, Bandra West.","Manchow soup,Schezwan Noodles",3)
        val r5= restaurant("Foo","Lower Parel.","Spicy Tuna Maki,Foo Wild Salmon Uramaki",5)
        val r6=restaurant("Something's Fishy","Mahakali.","Cocktail Prawn, Mutton Gassi",5)
        val r7= restaurant("The Sassy Spoon","Nariman Point.","Mushroom Gnocchi, Chocolate Chip Cookie Dough",5)

        val restrauntList = ArrayList<restaurant>()
        restrauntList.add(r1)
        restrauntList.add(r2)
        restrauntList.add(r3)
        restrauntList.add(r4)
        restrauntList.add(r5)
        restrauntList.add(r6)
        restrauntList.add(r7)

        restrauntListLivedata.postValue(restrauntList)
    }
}