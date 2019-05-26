package permutas

package object i18n {
  import constants._

  val translations: Map[(String, String), String] = Map(
    // Commands
    (Commands.ADD_PAYEE.toString, "en") -> "➕ Reusable Address",
    (Commands.ADD_PAYEE.toString, "es") -> "➕ Direccion Reusable",
    (Commands.ADDRESS_LIST.toString, "en") -> "\uD83D\uDCD6 Addressses",
    (Commands.ADDRESS_LIST.toString, "es") -> "\uD83D\uDCD6 Direcciones",
    //(Commands.ACTIVE_SWAPS.toString, "en") -> "\uD83D\uDD02 Current swaps",
    //(Commands.ACTIVE_SWAPS.toString, "es") -> "\uD83D\uDD02 Permutas vigentes",
    (Commands.BACK.toString, "en") -> "\uD83D\uDD19 Back",
    (Commands.BACK.toString, "es") -> "\uD83D\uDD19 Atrás",
    (Commands.BROADCAST.toString, "en") -> "\uD83D\uDC4C Send",
    (Commands.BROADCAST.toString, "es") -> "\uD83D\uDC4C Enviar",
    (Commands.BORROW.toString, "en") -> "\uD83D\uDD16 Borrow",
    (Commands.BORROW.toString, "es") -> "\uD83D\uDD16 Pedir prestado",
    (Commands.CANCEL.toString, "en") -> "❌ Cancel",
    (Commands.CANCEL.toString, "es") -> "❌ Cancelar",
    (Commands.ENCODE.toString, "en") -> "\uD83D\uDCDD Encode",
    (Commands.ENCODE.toString, "es") -> "\uD83D\uDCDD Codificar",
    (Commands.ENGLISH_LANG.toString, "en") -> "\uD83C\uDDEC\uD83C\uDDE7 English",
    (Commands.ENGLISH_LANG.toString, "es") -> "\uD83C\uDDEC\uD83C\uDDE7 Inglés",
    (Commands.FAUCET.toString, "en") -> "\uD83D\uDEB0 Faucet",
    (Commands.FAUCET.toString, "es") -> "\uD83D\uDEB0 Grifo",
    (Commands.GET_PAYEE.toString, "en") -> "\uD83D\uDCD6 Addresses",
    (Commands.GET_PAYEE.toString, "es") -> "\uD83D\uDCD6 Direcciones",
    (Commands.HTLC_LIST.toString, "en") -> "⏳ Contracts",
    (Commands.HTLC_LIST.toString, "es") -> "⏳ Contratos",
    (Commands.INFO.toString, "en") -> "ℹ Info",
    (Commands.INFO.toString, "es") -> "ℹ Información",
    (Commands.LANGUAGE.toString, "en") -> "\uD83C\uDF10 Language",
    (Commands.LANGUAGE.toString, "es") -> "\uD83C\uDF10 Idioma",
    (Commands.LOAN.toString, "en") -> "\uD83D\uDCD6 Loan",
    (Commands.LOAN.toString, "es") -> "\uD83D\uDCD6 Prestar",
    (Commands.LOCK.toString, "en") -> "\uD83D\uDDDD Lock",
    (Commands.LOCK.toString, "es") -> "\uD83D\uDDDD Inmobilizar",
    (Commands.LOCK_SWAP.toString, "en") -> "\uD83D\uDD02 Atomic swap",
    (Commands.LOCK_SWAP.toString, "es") -> "\uD83D\uDD02 Permuta atómica",
    (Commands.PAYEES.toString, "en") -> "\uD83D\uDC64 Payees",
    (Commands.PAYEES.toString, "es") -> "\uD83D\uDC64 Beneficiarios",
    (Commands.PEERS.toString, "en") -> "\uD83D\uDC65 Peers",
    (Commands.PEERS.toString, "es") -> "\uD83D\uDC65 Pares",
    (Commands.RATE.toString, "en") -> "Rate",
    (Commands.RATE.toString, "es") -> "Calificar",
    (Commands.REQUEST.toString, "en") -> "⬅ Request",
    (Commands.REQUEST.toString, "es") -> "⬅ Solicitar",
    (Commands.RESTORE.toString, "en") -> "\uD83D\uDCE6 Restore",
    (Commands.RESTORE.toString, "es") -> "\uD83D\uDCE6 Restaurar",
    (Commands.RESCAN.toString, "en") -> "♻ Rescan",
    (Commands.RESCAN.toString, "es") -> "♻ Sintonizar",
    (Commands.SEED.toString, "en") -> "\uD83E\uDD51 Seed",
    (Commands.SEED.toString, "es") -> "\uD83E\uDD51 Semilla",
    //(Commands.SWAPS.toString, "en") -> "\uD83D\uDD02 Swaps",
    //(Commands.SWAPS.toString, "es") -> "\uD83D\uDD02 Permutas",
    (Commands.SETTINGS.toString, "en") -> "\uD83D\uDD27 Settings",
    (Commands.SETTINGS.toString, "es") -> "\uD83D\uDD27 Ajustes",
    (Commands.SPANISH_LANG.toString, "en") -> "\uD83C\uDDEA\uD83C\uDDF8 Spanish",
    (Commands.SPANISH_LANG.toString, "es") -> "\uD83C\uDDEA\uD83C\uDDF8 Español",
    (Commands.SPEND.toString, "en") -> "▶ Spend",
    (Commands.SPEND.toString, "es") -> "▶ Gastar",
    (Commands.TRANSACTIONS.toString, "en") -> "\uD83D\uDD87 Transactions",
    (Commands.TRANSACTIONS.toString, "es") -> "\uD83D\uDD87 Transacciones",
    (Commands.VIEWSCRIPT.toString, "en") -> "\uD83D\uDCDD Script",
    (Commands.VIEWSCRIPT.toString, "es") -> "\uD83D\uDCDD Escrito",
    (Commands.WALLETS.toString, "en") -> "\uD83D\uDC5C Wallets",
    (Commands.WALLETS.toString, "es") -> "\uD83D\uDC5C Billeteras",
    (Commands.WHOAMI.toString, "en") -> "\uD83D\uDC7B Who am I", //👻
    (Commands.WHOAMI.toString, "es") -> "\uD83D\uDC7B Quién soy", //💻

    // Errata
    (Errors.NEEDS_START.toString, "en") -> "Click /start",
    (Errors.NEEDS_START.toString, "es") -> "Haz /start",
    (Errors.INVALID_COIN.toString, "en") -> "Pick one coin from the menu.",
    (Errors.INVALID_COIN.toString, "es") -> "Escoge una moneda del menu.",
    (Errors.INVALID_AMOUNT.toString, "en") -> "Send an amount like `0.1022 tBCH` or a percentage like `2.5%`",
    (Errors.INVALID_AMOUNT.toString, "es") -> "Envia una cantidad como `0.22` o un porcentaje como `2.5%`",
    (Errors.INVALID_RECIPIENT.toString, "en") -> "Enter a valid address or choose a contact ",
    (Errors.INVALID_RECIPIENT.toString, "es") -> "Ingresa una direccion o escoge un contacto",
    (Errors.MISSING_SPEND_COINS.toString, "en") -> s"To receive, click 🚰 Faucet",
    (Errors.MISSING_SPEND_COINS.toString, "es") -> s"Para recibir, clic en 🚰 Grifo",

    (Labels.ADD_AS_PAYEE.toString, "en") -> "➕ Add",
    (Labels.ADD_AS_PAYEE.toString, "es") -> "➕ Agregar",
    (Labels.CREATE_CHANNEL_CONFIRM.toString, "en") -> "Do you want to stablish a channel?",
    (Labels.CREATE_CHANNEL_CONFIRM.toString, "es") -> "¿Querés establecer un canal?",
    (Labels.BROADCAST_CONTRACT_CONFIRM.toString, "en") -> "Do you want to broadcast the contract?",
    (Labels.BROADCAST_CONTRACT_CONFIRM.toString, "es") -> "¿Querés transmitir el contrato?",
    (Labels.BROADCAST_TX_CONFIRM.toString, "en") -> "Do you want to broadcast the transaction?",
    (Labels.BROADCAST_TX_CONFIRM.toString, "es") -> "¿Querés transmitir la transacción?",
    (Labels.ENTER_SPEND_AMOUNT.toString, "en") -> "Enter spend amount:",
    (Labels.ENTER_SPEND_AMOUNT.toString, "es") -> "Ingresa la cantidad a gastar:",
    (Labels.HTLC_COUNTER_OFFER.toString, "en") -> "Negotiate",
    (Labels.HTLC_COUNTER_OFFER.toString, "es") -> "Negociar",
    (Labels.HTLC_FILL.toString, "en") -> "Fill",
    (Labels.HTLC_FILL.toString, "es") -> "Llenar",
    (Labels.HTLC_REFUND.toString, "en") -> "Refund",
    (Labels.HTLC_REFUND.toString, "es") -> "Rembolsar",
    (Labels.HTLC_SWEEP.toString, "en") -> "Sweep",
    (Labels.HTLC_SWEEP.toString, "es") -> "Barrer",
    (Labels.INCOMING_NTX.toString, "en") -> "🔔 Notification transaction",
    (Labels.INCOMING_NTX.toString, "es") -> "🔔 Transacción de notificación",
    (Labels.INCOMING_TX.toString, "en") -> "🔔 Incoming transaction",
    (Labels.INCOMING_TX.toString, "es") -> "🔔 Transacción entrante",
    (Labels.NEXT.toString, "en") -> "Next",
    (Labels.NEXT.toString, "es") -> "Siguiente",
    (Labels.OPEN_LINK.toString, "en") -> "Open", //Block explorer
    (Labels.OPEN_LINK.toString, "es") -> "Abrir", //Explorar
    (Labels.OUTGOING_TX.toString, "en") -> "🔔 Outgoing transaction",
    (Labels.OUTGOING_TX.toString, "es") -> "🔔 Transacción saliente",
    (Labels.PREV.toString, "en") -> "Prev",
    (Labels.PREV.toString, "es") -> "Anterior",
    (Labels.SWAP_FILL.toString, "en") -> "Fill Swap",
    (Labels.SWAP_FILL.toString, "es") -> "Concretar Permuta",
    (Labels.TX_HASH.toString, "en") -> "Hash",
    (Labels.TX_HASH.toString, "es") -> "Hash",
    (Labels.TX_SET_MEMO.toString, "en") -> "Set Memo",
    (Labels.TX_SET_MEMO.toString, "es") -> "Poner Nota",
    (Labels.VALUE_SENT_FROM_ME.toString, "en") -> "Value received",
    (Labels.VALUE_SENT_FROM_ME.toString, "es") -> "Valor recibido",
    (Labels.VALUE_SENT_TO_ME.toString, "en") -> "Value sent",
    (Labels.VALUE_SENT_TO_ME.toString, "es") -> "Valor enviado",
    (Labels.VIEW_CONTRACT.toString, "en") -> "View",
    (Labels.VIEW_CONTRACT.toString, "es") -> "Ver"
  )
}