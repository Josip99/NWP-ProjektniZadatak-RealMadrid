package com.realmadridinfo.ui.main.players

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.realmadridinfo.R
import com.realmadridinfo.`data`.models.Player
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class PlayersFragmentDirections private constructor() {
  private data class ActionPlayersFragmentToPlayerDetailsFragment(
    public val player: Player,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_playersFragment_to_playerDetailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Player::class.java)) {
          result.putParcelable("player", this.player as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Player::class.java)) {
          result.putSerializable("player", this.player as Serializable)
        } else {
          throw UnsupportedOperationException(Player::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionPlayersFragmentToPlayerDetailsFragment(player: Player): NavDirections =
        ActionPlayersFragmentToPlayerDetailsFragment(player)
  }
}
