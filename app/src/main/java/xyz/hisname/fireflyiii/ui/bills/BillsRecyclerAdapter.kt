package xyz.hisname.fireflyiii.ui.bills

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.bills_list_item.view.*
import xyz.hisname.fireflyiii.R
import xyz.hisname.fireflyiii.repository.models.bills.BillData
import xyz.hisname.fireflyiii.ui.base.DiffUtilAdapter
import xyz.hisname.fireflyiii.util.extension.getCompatColor
import xyz.hisname.fireflyiii.util.extension.inflate
import java.text.DecimalFormat

class BillsRecyclerAdapter(private val items: MutableList<BillData>, private val clickListener:(BillData) -> Unit):
        DiffUtilAdapter<BillData,BillsRecyclerAdapter.BillsHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BillsHolder {
        context = parent.context
        return BillsHolder(parent.inflate(R.layout.bills_list_item))
    }

    override fun onBindViewHolder(holder: BillsHolder, position: Int) {
        holder.bind(items[position], clickListener)
    }

    override fun getItemCount() = items.size

    inner class BillsHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(billData: BillData, clickListener: (BillData) -> Unit) = with(itemView) {
            val billResponse = billData.billAttributes
            var billName = billResponse?.name
            val isPending = billResponse?.isPending
            if(billName != null){
                if(billName.length >= 17){
                    billName = billName.substring(0,17) + "..."
                }
                if(isPending == true){
                    billName = "$billName (Pending)"
                    itemView.billName.setTextColor(context.getCompatColor(R.color.md_red_500))
                }
                itemView.billName.text = billName
            }
            itemView.setOnClickListener{clickListener(billData)}
            itemView.billAmount.text = context.getString(R.string.bill_amount, billResponse?.currency_code,
                    DecimalFormat("0.00").format(billResponse?.amount_max).toString())
            val freq = billResponse?.repeat_freq
            if(freq != null && freq.isNotBlank()){
                itemView.billFreq.text = freq.substring(0,1).toUpperCase() + freq.substring(1)
            }
            val nextMatch = billResponse?.next_expected_match
            if(nextMatch != null){
                itemView.billNextDueDate.text = billResponse.next_expected_match
            }
            itemView.billCard.setOnClickListener{clickListener(billData)}
        }
    }
}
