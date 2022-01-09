package trmenu.api.action.impl

import trmenu.api.action.base.AbstractAction
import trmenu.api.action.base.ActionOption
import org.bukkit.entity.Player
import trmenu.api.action.base.ActionDesc

/**
 * @author Arasple
 * @date 2021/1/29 21:22
 */
class ActionDelay(content: String) : AbstractAction(content) {

    fun getDelay(player: Player) = parseContent(player).toLongOrNull() ?: 0L

    override fun onExecute(player: Player, placeholderPlayer: Player) {
        TODO("Not yet implemented")
    }

    companion object : ActionDesc {

        override val name = "delay|wait".toRegex()

        override val parser: (Any, ActionOption) -> AbstractAction = { value, _ ->
            ActionDelay(value.toString())
        }

    }

}