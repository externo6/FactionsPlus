package markehme.factionsplus.config.sections;

import markehme.factionsplus.config.*;


public class SubSection_TeleportsIntoNeutralDeny {
	@Option(oldAliases_alwaysDotted={
	},realAlias_inNonDottedFormat = "viaHomeCommand" )
	public  final _boolean viaHome=new _boolean(false);
	
	
	@Option(oldAliases_alwaysDotted={
	},realAlias_inNonDottedFormat = "viaBackCommand" )
	public  final _boolean viaBack=new _boolean(false);
	
	
	@Option(oldAliases_alwaysDotted={
	},
		realAlias_inNonDottedFormat = "viaEnderPeals" )
	public  final _boolean viaPearls=new _boolean(false);

	
	public boolean isAnySet() {
		return viaHome._ || viaPearls._ || viaBack._;
	}

	public boolean shouldPreventHomeTelepors() {
		return viaHome._;
	}
	
	public boolean shouldPreventBackTelepors() {
		return viaBack._;
	}

	public boolean shouldPreventEnderPearlsTeleports() {
		return viaPearls._;
	}
}
