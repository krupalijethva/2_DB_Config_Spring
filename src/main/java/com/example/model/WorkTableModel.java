package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "work_table_model")
public class WorkTableModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "job_tag")
	private String jobTag;

	@Column(name = "size", length = 50)
	private String size;

	@Column(name = "table_type", length = 50)
	private String tableType;

	@Column(name = "backsplash_Type", length = 50)
	private String backsplashType;

	public String getBacksplashType() {
		return backsplashType;
	}

	public void setBacksplashType(String backsplashType) {
		this.backsplashType = backsplashType;
	}

	@Column(name = "tabel_acc", length = 50)
	private String tabelacc;

	@Column(name = "standardsize", length = 50)
	private String standardSize;

	@Column(name = "top_gauge", length = 50)
	private String topGauge;

	@Column(name = "undershelf_gauge", length = 50)
	private String undershelfGauge;

	@Column(name = "top_material_grade", length = 50)
	private String topMaterialGrade;

	@Column(name = "undershelf_material_grade", length = 50)
	private String undershelfMaterialGrade;

	@Column(name = "leg_undershelve", length = 50)
	private String legUndershelve;

	@Column(name = "table_depth")
	private String tableDepth;

	@Column(name = "table_lenght")
	private String tableLenght;

	@Column(name = "table_Height")
	private String tableHeight;

	@Column(name = "fully_welded")
	private boolean fullywelded;

	@Column(name = "undershelf_brace_clearance_check")
	private boolean undershelfBraceClearanceCheck;

	@Column(name = "undershelf_brace_clearance")
	private String undershelfBbraceClearance;

	@Column(name = "foottype")
	private String footType;

	@Column(name = "caster_type")
	private String casterType;

	@Column(name = "table_qty")
	private String tableQty;

	@Column(name = "grommet_hole")
	private boolean grommetHole;

	@Column(name = "grommet_hole_qty_tr")
	private String grommeHolQty;

	@Column(name = "receptacle_box")
	private boolean receptacleBox;

	@Column(name = "receptaclebox_qty")
	private String receptacleboxQty;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTag() {
		return jobTag;
	}

	public void setJobTag(String jobTag) {
		this.jobTag = jobTag;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public String getTabelacc() {
		return tabelacc;
	}

	public void setTabelacc(String tabelacc) {
		this.tabelacc = tabelacc;
	}

	public String getStandardSize() {
		return standardSize;
	}

	public void setStandardSize(String standardSize) {
		this.standardSize = standardSize;
	}

	public String getTopGauge() {
		return topGauge;
	}

	public void setTopGauge(String topGauge) {
		this.topGauge = topGauge;
	}

	public String getUndershelfGauge() {
		return undershelfGauge;
	}

	public void setUndershelfGauge(String undershelfGauge) {
		this.undershelfGauge = undershelfGauge;
	}

	public String getTopMaterialGrade() {
		return topMaterialGrade;
	}

	public void setTopMaterialGrade(String topMaterialGrade) {
		this.topMaterialGrade = topMaterialGrade;
	}

	public String getUndershelfMaterialGrade() {
		return undershelfMaterialGrade;
	}

	public void setUndershelfMaterialGrade(String undershelfMaterialGrade) {
		this.undershelfMaterialGrade = undershelfMaterialGrade;
	}

	public String getLegUndershelve() {
		return legUndershelve;
	}

	public void setLegUndershelve(String legUndershelve) {
		this.legUndershelve = legUndershelve;
	}

	public String getTableDepth() {
		return tableDepth;
	}

	public void setTableDepth(String tableDepth) {
		this.tableDepth = tableDepth;
	}

	public String getTableLenght() {
		return tableLenght;
	}

	public void setTableLenght(String tableLenght) {
		this.tableLenght = tableLenght;
	}

	public String getTableHeight() {
		return tableHeight;
	}

	public void setTableHeight(String tableHeight) {
		this.tableHeight = tableHeight;
	}

	public boolean isFullywelded() {
		return fullywelded;
	}

	public void setFullywelded(boolean fullywelded) {
		this.fullywelded = fullywelded;
	}

	public boolean isUndershelfBraceClearanceCheck() {
		return undershelfBraceClearanceCheck;
	}

	public void setUndershelfBraceClearanceCheck(boolean undershelfBraceClearanceCheck) {
		this.undershelfBraceClearanceCheck = undershelfBraceClearanceCheck;
	}

	public String getUndershelfBbraceClearance() {
		return undershelfBbraceClearance;
	}

	public void setUndershelfBbraceClearance(String undershelfBbraceClearance) {
		this.undershelfBbraceClearance = undershelfBbraceClearance;
	}

	public String getFootType() {
		return footType;
	}

	public void setFootType(String footType) {
		this.footType = footType;
	}

	public String getCasterType() {
		return casterType;
	}

	public void setCasterType(String casterType) {
		this.casterType = casterType;
	}

	public String getTableQty() {
		return tableQty;
	}

	public void setTableQty(String tableQty) {
		this.tableQty = tableQty;
	}

	public String getGrommeHolQty() {
		return grommeHolQty;
	}

	public void setGrommeHolQty(String grommeHolQty) {
		this.grommeHolQty = grommeHolQty;
	}

	public String getReceptacleboxQty() {
		return receptacleboxQty;
	}

	public void setReceptacleboxQty(String receptacleboxQty) {
		this.receptacleboxQty = receptacleboxQty;
	}

	// -------------------For Sink Tab---------------------------------------

	@Column(name = "sink_name", length = 50)
	private String sinkName;

	@Column(name = "sink_type", length = 50)
	private String sinkType;

	@Column(name = "sink_position", length = 50)
	private String sinkPosition;

	@Column(name = "sink_size", length = 50)
	private String sinkSize;

	@Column(name = "sink_Depth")
	private Double sinkDepth;

	@Column(name = "sink_Length")
	private Double sinkLength;

	@Column(name = "sink_Height1")
	private Double sinkHeight1;

	@Column(name = "sink_guage1", length = 20)
	private String sinkGuage1;

	@Column(name = "sink_grade", length = 20)
	private String sinkGrade;

	@Column(name = "sside", length = 50)
	private String sside;

	@Column(name = "customdist", length = 50)
	private String customdist;

	@Column(name = "operator_side", length = 50)
	private String operatorSide;

	@Column(name = "custom_dist_from_operator", length = 50)
	private String customDistFromOperator;

	@Column(name = "faucet_holes", length = 50)
	private String faucetHoles;

	@Column(name = "showhideQTYofsink", length = 50)
	private String showHideQTYofSink;

	@Column(name = "pre_rinch")
	private boolean preRinch;

	@Column(name = "model_no", length = 50)
	private String modelNo;

	@Column(name = "fuacet_qty", length = 50)
	private String fuacetQty;

	@Column(name = "faucet_mounting", length = 50)
	private String faucetMounting;

	@Column(name = "sink_divider")
	private boolean sinkDivider;

	@Column(name = "sink_apron")
	private boolean sinkApron;

	public String getSinkName() {
		return sinkName;
	}

	public void setSinkName(String sinkName) {
		this.sinkName = sinkName;
	}

	public Double getSinkDepth() {
		return sinkDepth;
	}

	public void setSinkDepth(Double sinkDepth) {
		this.sinkDepth = sinkDepth;
	}

	public Double getSinkLength() {
		return sinkLength;
	}

	public void setSinkLength(Double sinkLength) {
		this.sinkLength = sinkLength;
	}

	public Double getSinkHeight1() {
		return sinkHeight1;
	}

	public void setSinkHeight1(Double sinkHeight1) {
		this.sinkHeight1 = sinkHeight1;
	}

	public boolean isSinkDivider() {
		return sinkDivider;
	}

	public void setSinkDivider(boolean sinkDivider) {
		this.sinkDivider = sinkDivider;
	}

	public boolean isSinkApron() {
		return sinkApron;
	}

	public void setSinkApron(boolean sinkApron) {
		this.sinkApron = sinkApron;
	}

	public String getSinkType() {
		return sinkType;
	}

	public void setSinkType(String sinkType) {
		this.sinkType = sinkType;
	}

	public String getSinkPosition() {
		return sinkPosition;
	}

	public void setSinkPosition(String sinkPosition) {
		this.sinkPosition = sinkPosition;
	}

	public String getSinkSize() {
		return sinkSize;
	}

	public void setSinkSize(String sinkSize) {
		this.sinkSize = sinkSize;
	}

	public String getSinkGuage1() {
		return sinkGuage1;
	}

	public void setSinkGuage1(String sinkGuage1) {
		this.sinkGuage1 = sinkGuage1;
	}

	public String getSinkGrade() {
		return sinkGrade;
	}

	public void setSinkGrade(String sinkGrade) {
		this.sinkGrade = sinkGrade;
	}

	public String getSside() {
		return sside;
	}

	public void setSside(String sside) {
		this.sside = sside;
	}

	public String getCustomdist() {
		return customdist;
	}

	public void setCustomdist(String customdist) {
		this.customdist = customdist;
	}

	public String getOperatorSide() {
		return operatorSide;
	}

	public void setOperatorSide(String operatorSide) {
		this.operatorSide = operatorSide;
	}

	public String getCustomDistFromOperator() {
		return customDistFromOperator;
	}

	public void setCustomDistFromOperator(String customDistFromOperator) {
		this.customDistFromOperator = customDistFromOperator;
	}

	public String getFaucetHoles() {
		return faucetHoles;
	}

	public void setFaucetHoles(String faucetHoles) {
		this.faucetHoles = faucetHoles;
	}

	public String getFaucetMounting() {
		return faucetMounting;
	}

	public void setFaucetMounting(String faucetMounting) {
		this.faucetMounting = faucetMounting;
	}

	public String getShowHideQTYofSink() {
		return showHideQTYofSink;
	}

	public void setShowHideQTYofSink(String showHideQTYofSink) {
		this.showHideQTYofSink = showHideQTYofSink;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getFuacetQty() {
		return fuacetQty;
	}

	public void setFuacetQty(String fuacetQty) {
		this.fuacetQty = fuacetQty;
	}

	//
	//
	//
	// -------------------For Sink
	// 2---------------------------------------------------------------------------

	@Column(name = "sink_name2", length = 50)
	private String sinkName2;

	@Column(name = "sink_type2", length = 50)
	private String sinkType2;

	@Column(name = "sink_position2", length = 50)
	private String sinkPosition2;

	@Column(name = "sink_size2", length = 50)
	private String sinkSize2;

	@Column(name = "sink_Depth2", length = 20)
	private String sinkDepth2;

	@Column(name = "sink_Length2", length = 20)
	private String sinkLength2;

	@Column(name = "sink_Height12", length = 20)
	private String sinkHeight2;

	@Column(name = "sink_guage2", length = 20)
	private String sinkGuage2;

	@Column(name = "sink_grade2", length = 20)
	private String sinkGrade2;

	@Column(name = "sside2", length = 50)
	private String sside2;

	@Column(name = "customdist2", length = 20)
	private String customdist2;

	@Column(name = "operator_side2", length = 20)
	private String operatorSide2;

	@Column(name = "custom_dist_from_operator2", length = 20)
	private String customDistFromOperator2;

	@Column(name = "faucet_holes2")
	private String faucetHoles2;

	@Column(name = "showhideQTYofsink2")
	private String showHideQTYofSink2;

	@Column(name = "pre_rinch2")
	private boolean preRinch2;

	@Column(name = "model_no2")
	private String modelNo2;

	@Column(name = "fuacet_qty2")
	private String fuacetQty2;

	@Column(name = "sink_divider2")
	private Boolean sinkDivider2;

	@Column(name = "sink_apron2")
	private Boolean sinkApron2;

	public String getSinkName2() {
		return sinkName2;
	}

	public void setSinkName2(String sinkName2) {
		this.sinkName2 = sinkName2;
	}

	public String getSinkType2() {
		return sinkType2;
	}

	public void setSinkType2(String sinkType2) {
		this.sinkType2 = sinkType2;
	}

	public String getSinkPosition2() {
		return sinkPosition2;
	}

	public void setSinkPosition2(String sinkPosition2) {
		this.sinkPosition2 = sinkPosition2;
	}

	public String getSinkSize2() {
		return sinkSize2;
	}

	public void setSinkSize2(String sinkSize2) {
		this.sinkSize2 = sinkSize2;
	}

	public String getSinkDepth2() {
		return sinkDepth2;
	}

	public void setSinkDepth2(String sinkDepth2) {
		this.sinkDepth2 = sinkDepth2;
	}

	public String getSinkLength2() {
		return sinkLength2;
	}

	public void setSinkLength2(String sinkLength2) {
		this.sinkLength2 = sinkLength2;
	}

	public String getSinkHeight2() {
		return sinkHeight2;
	}

	public void setSinkHeight2(String sinkHeight2) {
		this.sinkHeight2 = sinkHeight2;
	}

	public String getSinkGuage2() {
		return sinkGuage2;
	}

	public void setSinkGuage2(String sinkGuage2) {
		this.sinkGuage2 = sinkGuage2;
	}

	public String getSinkGrade2() {
		return sinkGrade2;
	}

	public void setSinkGrade2(String sinkGrade2) {
		this.sinkGrade2 = sinkGrade2;
	}

	public String getSside2() {
		return sside2;
	}

	public void setSside2(String sside2) {
		this.sside2 = sside2;
	}

	public String getCustomdist2() {
		return customdist2;
	}

	public void setCustomdist2(String customdist2) {
		this.customdist2 = customdist2;
	}

	public String getOperatorSide2() {
		return operatorSide2;
	}

	public void setOperatorSide2(String operatorSide2) {
		this.operatorSide2 = operatorSide2;
	}

	public String getCustomDistFromOperator2() {
		return customDistFromOperator2;
	}

	public void setCustomDistFromOperator2(String customDistFromOperator2) {
		this.customDistFromOperator2 = customDistFromOperator2;
	}

	public String getFaucetHoles2() {
		return faucetHoles2;
	}

	public void setFaucetHoles2(String faucetHoles2) {
		this.faucetHoles2 = faucetHoles2;
	}

	public String getShowHideQTYofSink2() {
		return showHideQTYofSink2;
	}

	public void setShowHideQTYofSink2(String showHideQTYofSink2) {
		this.showHideQTYofSink2 = showHideQTYofSink2;
	}

	public boolean isGrommetHole() {
		return grommetHole;
	}

	public void setGrommetHole(boolean grommetHole) {
		this.grommetHole = grommetHole;
	}

	public boolean isReceptacleBox() {
		return receptacleBox;
	}

	public void setReceptacleBox(boolean receptacleBox) {
		this.receptacleBox = receptacleBox;
	}

	public boolean isPreRinch() {
		return preRinch;
	}

	public void setPreRinch(boolean preRinch) {
		this.preRinch = preRinch;
	}

	public boolean isPreRinch2() {
		return preRinch2;
	}

	public void setPreRinch2(boolean preRinch2) {
		this.preRinch2 = preRinch2;
	}

	public Boolean getSinkDivider2() {
		return sinkDivider2;
	}

	public void setSinkDivider2(Boolean sinkDivider2) {
		this.sinkDivider2 = sinkDivider2;
	}

	public Boolean getSinkApron2() {
		return sinkApron2;
	}

	public void setSinkApron2(Boolean sinkApron2) {
		this.sinkApron2 = sinkApron2;
	}

	public String getModelNo2() {
		return modelNo2;
	}

	public void setModelNo2(String modelNo2) {
		this.modelNo2 = modelNo2;
	}

	public String getFuacetQty2() {
		return fuacetQty2;
	}

	public void setFuacetQty2(String fuacetQty2) {
		this.fuacetQty2 = fuacetQty2;
	}

	//
	// ------------For Drawer----------------------------------------

	@Column(name = "drawer_id", length = 10)
	private String drawerId;

	@Column(name = "drawer_custom_dist", length = 10)
	private String drawerCustomDist;

	@Column(name = "drawer_lock", length = 10)
	private String drawerLock;

	@Column(name = "drawer_qty", length = 10)
	private String drawerQty;

	@Column(name = "drawer_front_dist_option", length = 10)
	private String drawerFrontDistOption;

	@Column(name = "drawer_front_dist", length = 10)
	private String drawerFrontDist;

	@Column(name = "drawer_stack")
	private boolean drawerStack;

	@Column(name = "drawer_stack_dist", length = 10)
	private String drawerStackDist;

	@Column(name = "drawer_stack_qty", length = 10)
	private String drawerStackQty;

	public String getDrawerId() {
		return drawerId;
	}

	public void setDrawerId(String drawerId) {
		this.drawerId = drawerId;
	}

	public String getDrawerCustomDist() {
		return drawerCustomDist;
	}

	public void setDrawerCustomDist(String drawerCustomDist) {
		this.drawerCustomDist = drawerCustomDist;
	}

	public String getDrawerLock() {
		return drawerLock;
	}

	public void setDrawerLock(String drawerLock) {
		this.drawerLock = drawerLock;
	}

	public String getDrawerQty() {
		return drawerQty;
	}

	public void setDrawerQty(String drawerQty) {
		this.drawerQty = drawerQty;
	}

	public String getDrawerFrontDistOption() {
		return drawerFrontDistOption;
	}

	public void setDrawerFrontDistOption(String drawerFrontDistOption) {
		this.drawerFrontDistOption = drawerFrontDistOption;
	}

	public String getDrawerFrontDist() {
		return drawerFrontDist;
	}

	public void setDrawerFrontDist(String drawerFrontDist) {
		this.drawerFrontDist = drawerFrontDist;
	}

	public boolean isDrawerStack() {
		return drawerStack;
	}

	public void setDrawerStack(boolean drawerStack) {
		this.drawerStack = drawerStack;
	}

	public String getDrawerStackDist() {
		return drawerStackDist;
	}

	public void setDrawerStackDist(String drawerStackDist) {
		this.drawerStackDist = drawerStackDist;
	}

	public String getDrawerStackQty() {
		return drawerStackQty;
	}

	public void setDrawerStackQty(String drawerStackQty) {
		this.drawerStackQty = drawerStackQty;
	}

	// -----------For Ice Bin----------------------------
	@Column(name = "pan_id", length = 10)
	private String panId;

	@Column(name = "ice_side_id", length = 10)
	private String iceSideId;

	@Column(name = "icebin_custom_length", length = 10)
	private String icebinCustomLength;

	@Column(name = "ice_operator", length = 30)
	private String iceOperator;

	@Column(name = "icebin_custom_depth", length = 10)
	private String icebinCustomDepth;

	public String getPanId() {
		return panId;
	}

	public void setPanId(String panId) {
		this.panId = panId;
	}

	public String getIceSideId() {
		return iceSideId;
	}

	public void setIceSideId(String iceSideId) {
		this.iceSideId = iceSideId;
	}

	public String getIcebinCustomLength() {
		return icebinCustomLength;
	}

	public void setIcebinCustomLength(String icebinCustomLength) {
		this.icebinCustomLength = icebinCustomLength;
	}

	public String getIceOperator() {
		return iceOperator;
	}

	public void setIceOperator(String iceOperator) {
		this.iceOperator = iceOperator;
	}

	public String getIcebinCustomDepth() {
		return icebinCustomDepth;
	}

	public void setIcebinCustomDepth(String icebinCustomDepth) {
		this.icebinCustomDepth = icebinCustomDepth;
	}
	//
	// --------------For Ice Display pan-------------------------------------

	@Column(name = "selpanSelection", length = 30)
	private String selpanSelection;

	@Column(name = "selpenside", length = 30)
	private String selpenSide;

	@Column(name = "pan_custom_length", length = 30)
	private String panCustomLength;

	@Column(name = "pan_operator", length = 30)
	private String panOperator;

	@Column(name = "pan_custom_depth", length = 30)
	private String panCustomDepth;

	public String getSelpanSelection() {
		return selpanSelection;
	}

	public void setSelpanSelection(String selpanSelection) {
		this.selpanSelection = selpanSelection;
	}

	public String getSelpenSide() {
		return selpenSide;
	}

	public void setSelpenSide(String selpenSide) {
		this.selpenSide = selpenSide;
	}

	public String getPanCustomLength() {
		return panCustomLength;
	}

	public void setPanCustomLength(String panCustomLength) {
		this.panCustomLength = panCustomLength;
	}

	public String getPanOperator() {
		return panOperator;
	}

	public void setPanOperator(String panOperator) {
		this.panOperator = panOperator;
	}

	public String getPanCustomDepth() {
		return panCustomDepth;
	}

	public void setPanCustomDepth(String panCustomDepth) {
		this.panCustomDepth = panCustomDepth;
	}

	// -- - - - - - - - - - - - - - - For Additional Shelf - - - - - -->

	@Column(name = "addtional_shelves_qty", length = 10)
	private String addtionalShelvesQty;

	@Column(name = "addtional_shelves_type", length = 30)
	private String addtionalShelvesType;

	@Column(name = "addtional_shelves_type_adjust", length = 30)
	private String addtionalShelvesTypeAdjust;

	@Column(name = "addtional_material", length = 30)
	private String addtionalMaterial;

	@Column(name = "addtional_gauge", length = 30)
	private String addtionalGauge;

	public String getAddtionalShelvesQty() {
		return addtionalShelvesQty;
	}

	public void setAddtionalShelvesQty(String addtionalShelvesQty) {
		this.addtionalShelvesQty = addtionalShelvesQty;
	}

	public String getAddtionalShelvesType() {
		return addtionalShelvesType;
	}

	public void setAddtionalShelvesType(String addtionalShelvesType) {
		this.addtionalShelvesType = addtionalShelvesType;
	}

	public String getAddtionalShelvesTypeAdjust() {
		return addtionalShelvesTypeAdjust;
	}

	public void setAddtionalShelvesTypeAdjust(String addtionalShelvesTypeAdjust) {
		this.addtionalShelvesTypeAdjust = addtionalShelvesTypeAdjust;
	}

	public String getAddtionalMaterial() {
		return addtionalMaterial;
	}

	public void setAddtionalMaterial(String addtionalMaterial) {
		this.addtionalMaterial = addtionalMaterial;
	}

	public String getAddtionalGauge() {
		return addtionalGauge;
	}

	public void setAddtionalGauge(String addtionalGauge) {
		this.addtionalGauge = addtionalGauge;
	}

	//
	//
	// -- Try or Pan slide --
	@Column(name = "tray_slide_spacing")
	private String traySlideSpacing;

	public String getTraySlideSpacing() {
		return traySlideSpacing;
	}

	public void setTraySlideSpacing(String traySlideSpacing) {
		this.traySlideSpacing = traySlideSpacing;
	}

	// -------------For Sani Board------------------------
	@Column(name = "sani_position", length = 50)
	private String saniPosition;

	@Column(name = "sani_operator", length = 50)
	private String saniOperator;

	@Column(name = "sani_custom_depth", length = 50)
	private String saniCustomDepth;
	
	@Column(name = "sani_custom_length", length = 50)
	private String saniCustomLength;

	@Column(name = "saniwidth", length = 10)
	private double saniWidth;

	@Column(name = "sanilength", length = 10)
	private double saniLength;

	@Column(name = "sani_thick", length = 10)
	private double saniThick;

	public String getSaniPosition() {
		return saniPosition;
	}

	public void setSaniPosition(String saniPosition) {
		this.saniPosition = saniPosition;
	}

	public String getSaniOperator() {
		return saniOperator;
	}

	public void setSaniOperator(String saniOperator) {
		this.saniOperator = saniOperator;
	}

	public String getSaniCustomDepth() {
		return saniCustomDepth;
	}

	public void setSaniCustomDepth(String saniCustomDepth) {
		this.saniCustomDepth = saniCustomDepth;
	}
	//
	//
	//
	// -- Sneeze gaurd and overshelf -- -------------------------

	public double getSaniWidth() {
		return saniWidth;
	}

	public void setSaniWidth(double saniWidth) {
		this.saniWidth = saniWidth;
	}

	public double getSaniLength() {
		return saniLength;
	}

	public void setSaniLength(double saniLength) {
		this.saniLength = saniLength;
	}

	public double getSaniThick() {
		return saniThick;
	}

	public void setSaniThick(double saniThick) {
		this.saniThick = saniThick;
	}

	@Column(name = "selovershelf", length = 50)
	private String seloverShelf;

	@Column(name = "overshelf_style", length = 50)
	private String overshelfStyle;

	@Column(name = "overshelf_size", length = 50)
	private String overshelfSize;

	@Column(name = "overshelf_custom_depth", length = 50)
	private String overshelfCustomDepth;

	@Column(name = "full_length", length = 50)
	private String fullLength;

	@Column(name = "overshelf_custom_length", length = 50)
	private String overshelfCustomLength;

	@Column(name = "overshlf_guage", length = 50)
	private String overshlfGuage;

	@Column(name = "overshelf_grade", length = 50)
	private String overshelfGrade;

	@Column(name = "overshelf_style_dist1", length = 50)
	private String overshelfStyleDist1;

	// @Column(name = "overshelf_style_dist2")
	// private String overshelfStyleDist2;
	//
	@Column(name = "sneeze_location", length = 30)
	private String sneezeLocation;

	@Column(name = "sneeze_custom_location", length = 50)
	private String sneezeCustomLocation;

	@Column(name = "sneeze_guard")
	private String sneezeGuard;

	@Column(name = "sneeze_id", length = 50)
	private String sneezeId;

	@Column(name = "led_light")
	private boolean ledLight;

	@Column(name = "overshelf_position", length = 50)
	private String overshelfPosition;

	@Column(name = "sneeze_custom_front", length = 50)
	private String sneezeCustomFront;

	@Column(name = "overshelf_bottom", length = 50)
	private String overshelfBottom;

	@Column(name = "overshelf_strip_location", length = 50)
	private String overshelfStripLocation;

	public String getSeloverShelf() {
		return seloverShelf;
	}

	public void setSeloverShelf(String seloverShelf) {
		this.seloverShelf = seloverShelf;
	}

	public String getOvershelfStyle() {
		return overshelfStyle;
	}

	public void setOvershelfStyle(String overshelfStyle) {
		this.overshelfStyle = overshelfStyle;
	}

	public String getOvershelfSize() {
		return overshelfSize;
	}

	public void setOvershelfSize(String overshelfSize) {
		this.overshelfSize = overshelfSize;
	}

	public String getOvershelfCustomDepth() {
		return overshelfCustomDepth;
	}

	public void setOvershelfCustomDepth(String overshelfCustomDepth) {
		this.overshelfCustomDepth = overshelfCustomDepth;
	}

	public String getFullLength() {
		return fullLength;
	}

	public void setFullLength(String fullLength) {
		this.fullLength = fullLength;
	}

	public String getOvershelfCustomLength() {
		return overshelfCustomLength;
	}

	public void setOvershelfCustomLength(String overshelfCustomLength) {
		this.overshelfCustomLength = overshelfCustomLength;
	}

	public String getOvershlfGuage() {
		return overshlfGuage;
	}

	public void setOvershlfGuage(String overshlfGuage) {
		this.overshlfGuage = overshlfGuage;
	}

	public String getOvershelfGrade() {
		return overshelfGrade;
	}

	public void setOvershelfGrade(String overshelfGrade) {
		this.overshelfGrade = overshelfGrade;
	}

	public String getOvershelfStyleDist1() {
		return overshelfStyleDist1;
	}

	public void setOvershelfStyleDist1(String overshelfStyleDist1) {
		this.overshelfStyleDist1 = overshelfStyleDist1;
	}

	// public String getOvershelfStyleDist2() {
	// return overshelfStyleDist2;
	// }
	//
	// public void setOvershelfStyleDist2(String overshelfStyleDist2) {
	// this.overshelfStyleDist2 = overshelfStyleDist2;
	// }

	public String getSneezeLocation() {
		return sneezeLocation;
	}

	public void setSneezeLocation(String sneezeLocation) {
		this.sneezeLocation = sneezeLocation;
	}

	public String getSneezeCustomLocation() {
		return sneezeCustomLocation;
	}

	public void setSneezeCustomLocation(String sneezeCustomLocation) {
		this.sneezeCustomLocation = sneezeCustomLocation;
	}

	public String getSneezeGuard() {
		return sneezeGuard;
	}

	public void setSneezeGuard(String sneezeGuard) {
		this.sneezeGuard = sneezeGuard;
	}

	public String getSneezeId() {
		return sneezeId;
	}

	public void setSneezeId(String sneezeId) {
		this.sneezeId = sneezeId;
	}

	public boolean isLedLight() {
		return ledLight;
	}

	public void setLedLight(boolean ledLight) {
		this.ledLight = ledLight;
	}

	public String getOvershelfPosition() {
		return overshelfPosition;
	}

	public void setOvershelfPosition(String overshelfPosition) {
		this.overshelfPosition = overshelfPosition;
	}

	public String getSneezeCustomFront() {
		return sneezeCustomFront;
	}

	public void setSneezeCustomFront(String sneezeCustomFront) {
		this.sneezeCustomFront = sneezeCustomFront;
	}

	public String getOvershelfBottom() {
		return overshelfBottom;
	}

	public void setOvershelfBottom(String overshelfBottom) {
		this.overshelfBottom = overshelfBottom;
	}

	public String getOvershelfStripLocation() {
		return overshelfStripLocation;
	}

	public void setOvershelfStripLocation(String overshelfStripLocation) {
		this.overshelfStripLocation = overshelfStripLocation;
	}
	//
	// -- SplashSide Start tab ---------------------

	@Column(name = "sidesplash_type")
	private String sidesplashType;

	@Column(name = "sidesplash_side")
	private String sidesplashSide;

	@Column(name = "sideslash_right")
	private String sideslashRight;

	@Column(name = "sideslash_left")
	private String sideslashLeft;

	@Column(name = "sideslash_back")
	private String sideslashBack;

	public String getSidesplashType() {
		return sidesplashType;
	}

	public void setSidesplashType(String sidesplashType) {
		this.sidesplashType = sidesplashType;
	}

	public String getSidesplashSide() {
		return sidesplashSide;
	}

	public void setSidesplashSide(String sidesplashSide) {
		this.sidesplashSide = sidesplashSide;
	}

	public String getSideslashRight() {
		return sideslashRight;
	}

	public void setSideslashRight(String sideslashRight) {
		this.sideslashRight = sideslashRight;
	}

	public String getSideslashLeft() {
		return sideslashLeft;
	}

	public void setSideslashLeft(String sideslashLeft) {
		this.sideslashLeft = sideslashLeft;
	}

	public String getSideslashBack() {
		return sideslashBack;
	}

	public void setSideslashBack(String sideslashBack) {
		this.sideslashBack = sideslashBack;
	}

	// <!-- Pot Racks -->

	@Column(name = "port_racks")
	private String portRacks;

	@Column(name = "port_operator")
	private String portOperator;

	@Column(name = "port_custom_depth")
	private String portCustomDepth;

	public String getPortRacks() {
		return portRacks;
	}

	public void setPortRacks(String portRacks) {
		this.portRacks = portRacks;
	}

	public String getPortOperator() {
		return portOperator;
	}

	public void setPortOperator(String portOperator) {
		this.portOperator = portOperator;
	}

	public String getPortCustomDepth() {
		return portCustomDepth;
	}

	public void setPortCustomDepth(String portCustomDepth) {
		this.portCustomDepth = portCustomDepth;
	}

	// -------------------- <!-- Scrap Chute -->------------
	@Column(name = "hand_side_scrap")
	private String handSideScrap;

	@Column(name = "side_dist_scrap")
	private String sideDistScrap;

	@Column(name = "operator_side_scrapchute")
	private String operatorsideScrapchute;

	@Column(name = "front_dist_scrap")
	private String frontDistScrap;

	public String getHandSideScrap() {
		return handSideScrap;
	}

	public void setHandSideScrap(String handSideScrap) {
		this.handSideScrap = handSideScrap;
	}

	public String getSideDistScrap() {
		return sideDistScrap;
	}

	public void setSideDistScrap(String sideDistScrap) {
		this.sideDistScrap = sideDistScrap;
	}

	public String getOperatorsideScrapchute() {
		return operatorsideScrapchute;
	}

	public void setOperatorsideScrapchute(String operatorsideScrapchute) {
		this.operatorsideScrapchute = operatorsideScrapchute;
	}

	public String getFrontDistScrap() {
		return frontDistScrap;
	}

	public void setFrontDistScrap(String frontDistScrap) {
		this.frontDistScrap = frontDistScrap;
	}

	//
	//
	// -------------------------- Partial Backsplash addon -----------
	@Column(name = "back_addon_length")
	private String backAddonLength;

	@Column(name = "back_addon_position")
	private String backAddonPosition;

	@Column(name = "backslash_custom")
	private String backslashCustom;

	public String getBackAddonLength() {
		return backAddonLength;
	}

	public void setBackAddonLength(String backAddonLength) {
		this.backAddonLength = backAddonLength;
	}

	public String getBackAddonPosition() {
		return backAddonPosition;
	}

	public void setBackAddonPosition(String backAddonPosition) {
		this.backAddonPosition = backAddonPosition;
	}

	public String getBackslashCustom() {
		return backslashCustom;
	}

	public void setBackslashCustom(String backslashCustom) {
		this.backslashCustom = backslashCustom;
	}

	@Override
	public String toString() {
		return "WorkTableModel [id=" + id + ", jobTag=" + jobTag + ", size=" + size + ", tableType=" + tableType
				+ ", backsplashType=" + backsplashType + ", tabelacc=" + tabelacc + ", standardSize=" + standardSize
				+ ", topGauge=" + topGauge + ", undershelfGauge=" + undershelfGauge + ", topMaterialGrade="
				+ topMaterialGrade + ", undershelfMaterialGrade=" + undershelfMaterialGrade + ", legUndershelve="
				+ legUndershelve + ", tableDepth=" + tableDepth + ", tableLenght=" + tableLenght + ", tableHeight="
				+ tableHeight + ", fullywelded=" + fullywelded + ", undershelfBraceClearanceCheck="
				+ undershelfBraceClearanceCheck + ", undershelfBbraceClearance=" + undershelfBbraceClearance
				+ ", footType=" + footType + ", casterType=" + casterType + ", tableQty=" + tableQty + ", grommetHole="
				+ grommetHole + ", grommeHolQty=" + grommeHolQty + ", receptacleBox=" + receptacleBox
				+ ", receptacleboxQty=" + receptacleboxQty + ", sinkName=" + sinkName + ", sinkType=" + sinkType
				+ ", sinkPosition=" + sinkPosition + ", sinkSize=" + sinkSize + ", sinkDepth=" + sinkDepth
				+ ", sinkLength=" + sinkLength + ", sinkHeight1=" + sinkHeight1 + ", sinkGuage1=" + sinkGuage1
				+ ", sinkGrade=" + sinkGrade + ", sside=" + sside + ", customdist=" + customdist + ", operatorSide="
				+ operatorSide + ", customDistFromOperator=" + customDistFromOperator + ", faucetHoles=" + faucetHoles
				+ ", showHideQTYofSink=" + showHideQTYofSink + ", preRinch=" + preRinch + ", modelNo=" + modelNo
				+ ", fuacetQty=" + fuacetQty + ", faucetMounting=" + faucetMounting + ", sinkDivider=" + sinkDivider
				+ ", sinkApron=" + sinkApron + ", sinkName2=" + sinkName2 + ", sinkType2=" + sinkType2
				+ ", sinkPosition2=" + sinkPosition2 + ", sinkSize2=" + sinkSize2 + ", sinkDepth2=" + sinkDepth2
				+ ", sinkLength2=" + sinkLength2 + ", sinkHeight2=" + sinkHeight2 + ", sinkGuage2=" + sinkGuage2
				+ ", sinkGrade2=" + sinkGrade2 + ", sside2=" + sside2 + ", customdist2=" + customdist2
				+ ", operatorSide2=" + operatorSide2 + ", customDistFromOperator2=" + customDistFromOperator2
				+ ", faucetHoles2=" + faucetHoles2 + ", showHideQTYofSink2=" + showHideQTYofSink2 + ", preRinch2="
				+ preRinch2 + ", modelNo2=" + modelNo2 + ", fuacetQty2=" + fuacetQty2 + ", sinkDivider2=" + sinkDivider2
				+ ", sinkApron2=" + sinkApron2 + ", drawerId=" + drawerId + ", drawerCustomDist=" + drawerCustomDist
				+ ", drawerLock=" + drawerLock + ", drawerQty=" + drawerQty + ", drawerFrontDistOption="
				+ drawerFrontDistOption + ", drawerFrontDist=" + drawerFrontDist + ", drawerStack=" + drawerStack
				+ ", drawerStackDist=" + drawerStackDist + ", drawerStackQty=" + drawerStackQty + ", panId=" + panId
				+ ", iceSideId=" + iceSideId + ", icebinCustomLength=" + icebinCustomLength + ", iceOperator="
				+ iceOperator + ", icebinCustomDepth=" + icebinCustomDepth + ", selpanSelection=" + selpanSelection
				+ ", selpenSide=" + selpenSide + ", panCustomLength=" + panCustomLength + ", panOperator=" + panOperator
				+ ", panCustomDepth=" + panCustomDepth + ", addtionalShelvesQty=" + addtionalShelvesQty
				+ ", addtionalShelvesType=" + addtionalShelvesType + ", addtionalShelvesTypeAdjust="
				+ addtionalShelvesTypeAdjust + ", addtionalMaterial=" + addtionalMaterial + ", addtionalGauge="
				+ addtionalGauge + ", traySlideSpacing=" + traySlideSpacing + ", saniPosition=" + saniPosition
				+ ", saniOperator=" + saniOperator + ", saniCustomDepth=" + saniCustomDepth + ", saniWidth=" + saniWidth
				+ ", saniLength=" + saniLength + ", saniThick=" + saniThick + ", seloverShelf=" + seloverShelf
				+ ", overshelfStyle=" + overshelfStyle + ", overshelfSize=" + overshelfSize + ", overshelfCustomDepth="
				+ overshelfCustomDepth + ", fullLength=" + fullLength + ", overshelfCustomLength="
				+ overshelfCustomLength + ", overshlfGuage=" + overshlfGuage + ", overshelfGrade=" + overshelfGrade
				+ ", overshelfStyleDist1=" + overshelfStyleDist1 + ", sneezeLocation=" + sneezeLocation
				+ ", sneezeCustomLocation=" + sneezeCustomLocation + ", sneezeGuard=" + sneezeGuard + ", sneezeId="
				+ sneezeId + ", ledLight=" + ledLight + ", overshelfPosition=" + overshelfPosition
				+ ", sneezeCustomFront=" + sneezeCustomFront + ", overshelfBottom=" + overshelfBottom
				+ ", overshelfStripLocation=" + overshelfStripLocation + ", sidesplashType=" + sidesplashType
				+ ", sidesplashSide=" + sidesplashSide + ", sideslashRight=" + sideslashRight + ", sideslashLeft="
				+ sideslashLeft + ", sideslashBack=" + sideslashBack + ", portRacks=" + portRacks + ", portOperator="
				+ portOperator + ", portCustomDepth=" + portCustomDepth + ", handSideScrap=" + handSideScrap
				+ ", sideDistScrap=" + sideDistScrap + ", operatorsideScrapchute=" + operatorsideScrapchute
				+ ", frontDistScrap=" + frontDistScrap + ", backAddonLength=" + backAddonLength + ", backAddonPosition="
				+ backAddonPosition + ", backslashCustom=" + backslashCustom + "]";
	}

	// -------------------For Customer------------
	// @Column(name = "quoteno")
	// private String quoteNo;
	//
	// @Column(name = "customername")
	// private String customerName;
	//
	// @Column(name = "consultant")
	// private String consultant;
	//
	// @Column(name = "dealers")
	// private String dealers;
	//
	// @Column(name = "company_name")
	// private String companyName;
	//
	// @Column(name = "address")
	// private String address;
	//
	// @Column(name = "selcountry")
	// private String country;
	//
	// @Column(name = "selstate")
	// private String selState;
	//
	// @Column(name = "txtpostalcode")
	// private String txtpostalCode;
	//
	// @Column(name = "txtphonenumber")
	// private String txtphoneNumber;
	//
	// @Column(name = "txtfaxno")
	// private String faxNo;
	//
	// @Column(name = "txtcity")
	// private String City;
	//
	// @Column(name = "emailId")
	// private String emailId;
	//
	// @Column(name = "reference")
	// private String reference;
	//
	// @Column(name = "selterms")
	// private String Terms;
	//
	// public String getQuoteNo() {
	// return quoteNo;
	// }
	//
	// public void setQuoteNo(String quoteNo) {
	// this.quoteNo = quoteNo;
	// }
	//
	// public String getCustomerName() {
	// return customerName;
	// }
	//
	// public void setCustomerName(String customerName) {
	// this.customerName = customerName;
	// }
	//
	// public String getConsultant() {
	// return consultant;
	// }
	//
	// public void setConsultant(String consultant) {
	// this.consultant = consultant;
	// }
	//
	// public String getDealers() {
	// return dealers;
	// }
	//
	// public void setDealers(String dealers) {
	// this.dealers = dealers;
	// }
	//
	// public String getCompanyName() {
	// return companyName;
	// }
	//
	// public void setCompanyName(String companyName) {
	// this.companyName = companyName;
	// }
	//
	// public String getAddress() {
	// return address;
	// }
	//
	// public void setAddress(String address) {
	// this.address = address;
	// }
	//
	// public String getCountry() {
	// return country;
	// }
	//
	// public void setCountry(String country) {
	// this.country = country;
	// }
	//
	// public String getSelState() {
	// return selState;
	// }
	//
	// public void setSelState(String selState) {
	// this.selState = selState;
	// }
	//
	// public String getTxtpostalCode() {
	// return txtpostalCode;
	// }
	//
	// public void setTxtpostalCode(String txtpostalCode) {
	// this.txtpostalCode = txtpostalCode;
	// }
	//
	// public String getTxtphoneNumber() {
	// return txtphoneNumber;
	// }
	//
	// public void setTxtphoneNumber(String txtphoneNumber) {
	// this.txtphoneNumber = txtphoneNumber;
	// }
	//
	// public String getFaxNo() {
	// return faxNo;
	// }
	//
	// public void setFaxNo(String faxNo) {
	// this.faxNo = faxNo;
	// }
	//
	// public String getCity() {
	// return City;
	// }
	//
	// public void setCity(String city) {
	// City = city;
	// }
	//
	// public String getEmailId() {
	// return emailId;
	// }
	//
	// public void setEmailId(String emailId) {
	// this.emailId = emailId;
	// }
	//
	// public String getReference() {
	// return reference;
	// }
	//
	// public void setReference(String reference) {
	// this.reference = reference;
	// }
	//
	// public String getTerms() {
	// return Terms;
	// }
	//
	// public void setTerms(String terms) {
	// Terms = terms;
	// }
	//

}
