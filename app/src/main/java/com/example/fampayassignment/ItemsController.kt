package com.example.fampayassignment

import com.airbnb.epoxy.TypedEpoxyController
import com.example.fampayassignment.Model.ItemsDesc
import com.example.fampayassignment.Model.epoxy.*

class ItemController : TypedEpoxyController<List<ItemsDesc>>(){
    override fun buildModels(data: List<ItemsDesc>?) {
        data?.forEach {
            if (it.designType.equals("HC3")){
                bigDisplayCard {
                    id("$modelCountBuiltSoFar")
                    it.cards[0].formattedTitle?.entities?.get(0).let { it1 -> titleText1(it1) }
                    it.cards[0].formattedTitle?.entities?.get(1).let { it1 -> titleText2(it1) }
                    it.cards[0].formattedDescription?.entities?.get(0)?.let { it1 -> textDesc(it1) }
                    it.cards[0].cta[0].url?.let { it1 -> cta(it1) }
                    it.cards[0].bgImage?.imageUrl?.let { it1 -> backgroundImage(it1) }
                }
            }
            else if (it.designType.equals("HC5")){
                imageCard {
                    id("$modelCountBuiltSoFar")
                    it.cards[0].bgImage?.imageUrl?.let { it1 -> image(it1) }
                }
            }
            else if (it.designType.equals("HC6")){
                smallArrowCard {
                    id("$modelCountBuiltSoFar")
                    it.cards[0].icon.imgurl?.let { it1 -> icon(it1) }
                    it.cards[0].formattedTitle?.text?.let { it1 -> text(it1) }
                }
            }
            else if (it.designType.equals("HC1")){
                if(it.isScrollable == true){
                    smallDisplayCardScrollable {
                        id("$modelCountBuiltSoFar")
                        it.cards[0].icon.imgurl?.let { it1 -> icon1(it1) }
                        it.cards[1].icon.imgurl?.let { it1 -> icon2(it1) }
                        it.cards[0].formattedTitle?.text?.let { it1 -> text1(it1) }
                        it.cards[1].formattedTitle?.text?.let { it1 -> text2(it1) }
                        text3(it.cards[1])
                    }
                }
                else{
                    smallDisplayCard {
                        id("$modelCountBuiltSoFar")
                        it.cards[0].icon.imgurl?.let { it1 -> icon1(it1) }
                        it.cards[1].icon.imgurl?.let { it1 -> icon2(it1) }
                        it.cards[0].formattedTitle?.text?.let { it1 -> text1(it1) }
                        it.cards[1].formattedTitle?.text?.let { it1 -> text2(it1) }
                        text3(it.cards[1])
                    }
                }
            }
        }
    }

}