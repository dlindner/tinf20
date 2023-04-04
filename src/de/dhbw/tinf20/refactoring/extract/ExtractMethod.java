package de.dhbw.tinf20.refactoring.extract;

import java.util.function.Supplier;

public class ExtractMethod {

	private void performIf(
		Supplier<Boolean> bedingung,
		Runnable aktion
	) {
		if (bedingung.get()) {
			aktion.run();
		}
	}
	
    public void activate(final DelphinValueProvider valueProvider, final RamsesStationManager stationManager) {
    	performIf(
			() -> !ArrayUtil.isEmptyOrNull(stationManager.getAllStations()),
			() -> {
		        // Selection
		        DelphinChannelSpecificationDialog channelDialog = new DelphinChannelSpecificationDialog(
		            getSession(),
		            RamsesStationManagerUtil.getAllStationIdentifiersFor(stationManager)
		        );
		        channelDialog.showDialog();
		        if (channelDialog.wasClosedByCancel()) {
		            return;
		        }

		        // Display
		        final DelphinValueDevelopingDialog dialog = new DelphinValueDevelopingDialog(
		                getSession(),
		                new GenericDelphinChannelReference(
		                        channelDialog.getSelectedStation(),
		                        channelDialog.getChannelName())
		        );
//		        valueProvider.addDelphinValueListener(dialog);
//		        dialog.showDialog();
//		        dialog.addCloseListener(new DialogCloseListener() {
//		            @Override
//		            public void dialogClosed(SchneideDialog schneideDialog) {
//		                valueProvider.removeDelphinValueListener(dialog);
//		            }
//		        });
			}
		);
    }

	private Session getSession() {
		// TODO Auto-generated method stub
		return null;
	}
}
