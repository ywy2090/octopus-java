// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/hive/v2/HiveParser.g4
// by ANTLR 4.13.1
package myfirstjava.demo.antlr.codegen.hive.v2;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/** This interface defines a complete listener for a parse tree produced by {@link HiveParser}. */
public interface HiveParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link HiveParser#statements}.
     *
     * @param ctx the parse tree
     */
    void enterStatements(HiveParser.StatementsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#statements}.
     *
     * @param ctx the parse tree
     */
    void exitStatements(HiveParser.StatementsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#statementSeparator}.
     *
     * @param ctx the parse tree
     */
    void enterStatementSeparator(HiveParser.StatementSeparatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#statementSeparator}.
     *
     * @param ctx the parse tree
     */
    void exitStatementSeparator(HiveParser.StatementSeparatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#empty}.
     *
     * @param ctx the parse tree
     */
    void enterEmpty(HiveParser.EmptyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#empty}.
     *
     * @param ctx the parse tree
     */
    void exitEmpty(HiveParser.EmptyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(HiveParser.StatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(HiveParser.StatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#explainStatement}.
     *
     * @param ctx the parse tree
     */
    void enterExplainStatement(HiveParser.ExplainStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#explainStatement}.
     *
     * @param ctx the parse tree
     */
    void exitExplainStatement(HiveParser.ExplainStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#explainOption}.
     *
     * @param ctx the parse tree
     */
    void enterExplainOption(HiveParser.ExplainOptionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#explainOption}.
     *
     * @param ctx the parse tree
     */
    void exitExplainOption(HiveParser.ExplainOptionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#vectorizationOnly}.
     *
     * @param ctx the parse tree
     */
    void enterVectorizationOnly(HiveParser.VectorizationOnlyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#vectorizationOnly}.
     *
     * @param ctx the parse tree
     */
    void exitVectorizationOnly(HiveParser.VectorizationOnlyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#vectorizatonDetail}.
     *
     * @param ctx the parse tree
     */
    void enterVectorizatonDetail(HiveParser.VectorizatonDetailContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#vectorizatonDetail}.
     *
     * @param ctx the parse tree
     */
    void exitVectorizatonDetail(HiveParser.VectorizatonDetailContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#execStatement}.
     *
     * @param ctx the parse tree
     */
    void enterExecStatement(HiveParser.ExecStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#execStatement}.
     *
     * @param ctx the parse tree
     */
    void exitExecStatement(HiveParser.ExecStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#loadStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLoadStatement(HiveParser.LoadStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#loadStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLoadStatement(HiveParser.LoadStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#replicationClause}.
     *
     * @param ctx the parse tree
     */
    void enterReplicationClause(HiveParser.ReplicationClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#replicationClause}.
     *
     * @param ctx the parse tree
     */
    void exitReplicationClause(HiveParser.ReplicationClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#exportStatement}.
     *
     * @param ctx the parse tree
     */
    void enterExportStatement(HiveParser.ExportStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#exportStatement}.
     *
     * @param ctx the parse tree
     */
    void exitExportStatement(HiveParser.ExportStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#importStatement}.
     *
     * @param ctx the parse tree
     */
    void enterImportStatement(HiveParser.ImportStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#importStatement}.
     *
     * @param ctx the parse tree
     */
    void exitImportStatement(HiveParser.ImportStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#replDumpStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReplDumpStatement(HiveParser.ReplDumpStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#replDumpStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReplDumpStatement(HiveParser.ReplDumpStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#replLoadStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReplLoadStatement(HiveParser.ReplLoadStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#replLoadStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReplLoadStatement(HiveParser.ReplLoadStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#replConfigs}.
     *
     * @param ctx the parse tree
     */
    void enterReplConfigs(HiveParser.ReplConfigsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#replConfigs}.
     *
     * @param ctx the parse tree
     */
    void exitReplConfigs(HiveParser.ReplConfigsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#replConfigsList}.
     *
     * @param ctx the parse tree
     */
    void enterReplConfigsList(HiveParser.ReplConfigsListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#replConfigsList}.
     *
     * @param ctx the parse tree
     */
    void exitReplConfigsList(HiveParser.ReplConfigsListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#replStatusStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReplStatusStatement(HiveParser.ReplStatusStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#replStatusStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReplStatusStatement(HiveParser.ReplStatusStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#ddlStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDdlStatement(HiveParser.DdlStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#ddlStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDdlStatement(HiveParser.DdlStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#ifExists}.
     *
     * @param ctx the parse tree
     */
    void enterIfExists(HiveParser.IfExistsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#ifExists}.
     *
     * @param ctx the parse tree
     */
    void exitIfExists(HiveParser.IfExistsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#restrictOrCascade}.
     *
     * @param ctx the parse tree
     */
    void enterRestrictOrCascade(HiveParser.RestrictOrCascadeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#restrictOrCascade}.
     *
     * @param ctx the parse tree
     */
    void exitRestrictOrCascade(HiveParser.RestrictOrCascadeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#ifNotExists}.
     *
     * @param ctx the parse tree
     */
    void enterIfNotExists(HiveParser.IfNotExistsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#ifNotExists}.
     *
     * @param ctx the parse tree
     */
    void exitIfNotExists(HiveParser.IfNotExistsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#rewriteEnabled}.
     *
     * @param ctx the parse tree
     */
    void enterRewriteEnabled(HiveParser.RewriteEnabledContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#rewriteEnabled}.
     *
     * @param ctx the parse tree
     */
    void exitRewriteEnabled(HiveParser.RewriteEnabledContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#rewriteDisabled}.
     *
     * @param ctx the parse tree
     */
    void enterRewriteDisabled(HiveParser.RewriteDisabledContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#rewriteDisabled}.
     *
     * @param ctx the parse tree
     */
    void exitRewriteDisabled(HiveParser.RewriteDisabledContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#storedAsDirs}.
     *
     * @param ctx the parse tree
     */
    void enterStoredAsDirs(HiveParser.StoredAsDirsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#storedAsDirs}.
     *
     * @param ctx the parse tree
     */
    void exitStoredAsDirs(HiveParser.StoredAsDirsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#orReplace}.
     *
     * @param ctx the parse tree
     */
    void enterOrReplace(HiveParser.OrReplaceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#orReplace}.
     *
     * @param ctx the parse tree
     */
    void exitOrReplace(HiveParser.OrReplaceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createDatabaseStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateDatabaseStatement(HiveParser.CreateDatabaseStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createDatabaseStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateDatabaseStatement(HiveParser.CreateDatabaseStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dbLocation}.
     *
     * @param ctx the parse tree
     */
    void enterDbLocation(HiveParser.DbLocationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dbLocation}.
     *
     * @param ctx the parse tree
     */
    void exitDbLocation(HiveParser.DbLocationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dbProperties}.
     *
     * @param ctx the parse tree
     */
    void enterDbProperties(HiveParser.DbPropertiesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dbProperties}.
     *
     * @param ctx the parse tree
     */
    void exitDbProperties(HiveParser.DbPropertiesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dbPropertiesList}.
     *
     * @param ctx the parse tree
     */
    void enterDbPropertiesList(HiveParser.DbPropertiesListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dbPropertiesList}.
     *
     * @param ctx the parse tree
     */
    void exitDbPropertiesList(HiveParser.DbPropertiesListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#switchDatabaseStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchDatabaseStatement(HiveParser.SwitchDatabaseStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#switchDatabaseStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchDatabaseStatement(HiveParser.SwitchDatabaseStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropDatabaseStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDropDatabaseStatement(HiveParser.DropDatabaseStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropDatabaseStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDropDatabaseStatement(HiveParser.DropDatabaseStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#databaseComment}.
     *
     * @param ctx the parse tree
     */
    void enterDatabaseComment(HiveParser.DatabaseCommentContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#databaseComment}.
     *
     * @param ctx the parse tree
     */
    void exitDatabaseComment(HiveParser.DatabaseCommentContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createTableStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTableStatement(HiveParser.CreateTableStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createTableStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTableStatement(HiveParser.CreateTableStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#truncateTableStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTruncateTableStatement(HiveParser.TruncateTableStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#truncateTableStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTruncateTableStatement(HiveParser.TruncateTableStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropTableStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDropTableStatement(HiveParser.DropTableStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropTableStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDropTableStatement(HiveParser.DropTableStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatement}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatement(HiveParser.AlterStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatement}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatement(HiveParser.AlterStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterTableStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void enterAlterTableStatementSuffix(HiveParser.AlterTableStatementSuffixContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterTableStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void exitAlterTableStatementSuffix(HiveParser.AlterTableStatementSuffixContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterTblPartitionStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void enterAlterTblPartitionStatementSuffix(
            HiveParser.AlterTblPartitionStatementSuffixContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterTblPartitionStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void exitAlterTblPartitionStatementSuffix(
            HiveParser.AlterTblPartitionStatementSuffixContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementPartitionKeyType}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementPartitionKeyType(HiveParser.AlterStatementPartitionKeyTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementPartitionKeyType}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementPartitionKeyType(HiveParser.AlterStatementPartitionKeyTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterViewStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void enterAlterViewStatementSuffix(HiveParser.AlterViewStatementSuffixContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterViewStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void exitAlterViewStatementSuffix(HiveParser.AlterViewStatementSuffixContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterMaterializedViewStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void enterAlterMaterializedViewStatementSuffix(
            HiveParser.AlterMaterializedViewStatementSuffixContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterMaterializedViewStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void exitAlterMaterializedViewStatementSuffix(
            HiveParser.AlterMaterializedViewStatementSuffixContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterDatabaseStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void enterAlterDatabaseStatementSuffix(HiveParser.AlterDatabaseStatementSuffixContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterDatabaseStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void exitAlterDatabaseStatementSuffix(HiveParser.AlterDatabaseStatementSuffixContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterDatabaseSuffixProperties}.
     *
     * @param ctx the parse tree
     */
    void enterAlterDatabaseSuffixProperties(HiveParser.AlterDatabaseSuffixPropertiesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterDatabaseSuffixProperties}.
     *
     * @param ctx the parse tree
     */
    void exitAlterDatabaseSuffixProperties(HiveParser.AlterDatabaseSuffixPropertiesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterDatabaseSuffixSetOwner}.
     *
     * @param ctx the parse tree
     */
    void enterAlterDatabaseSuffixSetOwner(HiveParser.AlterDatabaseSuffixSetOwnerContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterDatabaseSuffixSetOwner}.
     *
     * @param ctx the parse tree
     */
    void exitAlterDatabaseSuffixSetOwner(HiveParser.AlterDatabaseSuffixSetOwnerContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterDatabaseSuffixSetLocation}.
     *
     * @param ctx the parse tree
     */
    void enterAlterDatabaseSuffixSetLocation(HiveParser.AlterDatabaseSuffixSetLocationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterDatabaseSuffixSetLocation}.
     *
     * @param ctx the parse tree
     */
    void exitAlterDatabaseSuffixSetLocation(HiveParser.AlterDatabaseSuffixSetLocationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixRename}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixRename(HiveParser.AlterStatementSuffixRenameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixRename}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixRename(HiveParser.AlterStatementSuffixRenameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixAddCol}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixAddCol(HiveParser.AlterStatementSuffixAddColContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixAddCol}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixAddCol(HiveParser.AlterStatementSuffixAddColContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixAddConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixAddConstraint(
            HiveParser.AlterStatementSuffixAddConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixAddConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixAddConstraint(
            HiveParser.AlterStatementSuffixAddConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixDropConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixDropConstraint(
            HiveParser.AlterStatementSuffixDropConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixDropConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixDropConstraint(
            HiveParser.AlterStatementSuffixDropConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixRenameCol}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixRenameCol(HiveParser.AlterStatementSuffixRenameColContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixRenameCol}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixRenameCol(HiveParser.AlterStatementSuffixRenameColContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixUpdateStatsCol}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixUpdateStatsCol(
            HiveParser.AlterStatementSuffixUpdateStatsColContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixUpdateStatsCol}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixUpdateStatsCol(
            HiveParser.AlterStatementSuffixUpdateStatsColContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixUpdateStats}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixUpdateStats(
            HiveParser.AlterStatementSuffixUpdateStatsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixUpdateStats}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixUpdateStats(HiveParser.AlterStatementSuffixUpdateStatsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementChangeColPosition}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementChangeColPosition(
            HiveParser.AlterStatementChangeColPositionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementChangeColPosition}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementChangeColPosition(HiveParser.AlterStatementChangeColPositionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixAddPartitions}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixAddPartitions(
            HiveParser.AlterStatementSuffixAddPartitionsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixAddPartitions}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixAddPartitions(
            HiveParser.AlterStatementSuffixAddPartitionsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixAddPartitionsElement}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixAddPartitionsElement(
            HiveParser.AlterStatementSuffixAddPartitionsElementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixAddPartitionsElement}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixAddPartitionsElement(
            HiveParser.AlterStatementSuffixAddPartitionsElementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixTouch}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixTouch(HiveParser.AlterStatementSuffixTouchContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixTouch}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixTouch(HiveParser.AlterStatementSuffixTouchContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixArchive}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixArchive(HiveParser.AlterStatementSuffixArchiveContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixArchive}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixArchive(HiveParser.AlterStatementSuffixArchiveContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixUnArchive}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixUnArchive(HiveParser.AlterStatementSuffixUnArchiveContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixUnArchive}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixUnArchive(HiveParser.AlterStatementSuffixUnArchiveContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#partitionLocation}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionLocation(HiveParser.PartitionLocationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#partitionLocation}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionLocation(HiveParser.PartitionLocationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixDropPartitions}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixDropPartitions(
            HiveParser.AlterStatementSuffixDropPartitionsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixDropPartitions}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixDropPartitions(
            HiveParser.AlterStatementSuffixDropPartitionsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixProperties}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixProperties(HiveParser.AlterStatementSuffixPropertiesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixProperties}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixProperties(HiveParser.AlterStatementSuffixPropertiesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterViewSuffixProperties}.
     *
     * @param ctx the parse tree
     */
    void enterAlterViewSuffixProperties(HiveParser.AlterViewSuffixPropertiesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterViewSuffixProperties}.
     *
     * @param ctx the parse tree
     */
    void exitAlterViewSuffixProperties(HiveParser.AlterViewSuffixPropertiesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterMaterializedViewSuffixRewrite}.
     *
     * @param ctx the parse tree
     */
    void enterAlterMaterializedViewSuffixRewrite(
            HiveParser.AlterMaterializedViewSuffixRewriteContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterMaterializedViewSuffixRewrite}.
     *
     * @param ctx the parse tree
     */
    void exitAlterMaterializedViewSuffixRewrite(
            HiveParser.AlterMaterializedViewSuffixRewriteContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterMaterializedViewSuffixRebuild}.
     *
     * @param ctx the parse tree
     */
    void enterAlterMaterializedViewSuffixRebuild(
            HiveParser.AlterMaterializedViewSuffixRebuildContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterMaterializedViewSuffixRebuild}.
     *
     * @param ctx the parse tree
     */
    void exitAlterMaterializedViewSuffixRebuild(
            HiveParser.AlterMaterializedViewSuffixRebuildContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixSerdeProperties}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixSerdeProperties(
            HiveParser.AlterStatementSuffixSerdePropertiesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixSerdeProperties}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixSerdeProperties(
            HiveParser.AlterStatementSuffixSerdePropertiesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterIndexStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void enterAlterIndexStatementSuffix(HiveParser.AlterIndexStatementSuffixContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterIndexStatementSuffix}.
     *
     * @param ctx the parse tree
     */
    void exitAlterIndexStatementSuffix(HiveParser.AlterIndexStatementSuffixContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixFileFormat}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixFileFormat(HiveParser.AlterStatementSuffixFileFormatContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixFileFormat}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixFileFormat(HiveParser.AlterStatementSuffixFileFormatContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixClusterbySortby}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixClusterbySortby(
            HiveParser.AlterStatementSuffixClusterbySortbyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixClusterbySortby}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixClusterbySortby(
            HiveParser.AlterStatementSuffixClusterbySortbyContext ctx);
    /**
     * Enter a parse tree produced by {@link
     * HiveParser#alterTblPartitionStatementSuffixSkewedLocation}.
     *
     * @param ctx the parse tree
     */
    void enterAlterTblPartitionStatementSuffixSkewedLocation(
            HiveParser.AlterTblPartitionStatementSuffixSkewedLocationContext ctx);
    /**
     * Exit a parse tree produced by {@link
     * HiveParser#alterTblPartitionStatementSuffixSkewedLocation}.
     *
     * @param ctx the parse tree
     */
    void exitAlterTblPartitionStatementSuffixSkewedLocation(
            HiveParser.AlterTblPartitionStatementSuffixSkewedLocationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedLocations}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedLocations(HiveParser.SkewedLocationsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedLocations}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedLocations(HiveParser.SkewedLocationsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedLocationsList}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedLocationsList(HiveParser.SkewedLocationsListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedLocationsList}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedLocationsList(HiveParser.SkewedLocationsListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedLocationMap}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedLocationMap(HiveParser.SkewedLocationMapContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedLocationMap}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedLocationMap(HiveParser.SkewedLocationMapContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixLocation}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixLocation(HiveParser.AlterStatementSuffixLocationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixLocation}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixLocation(HiveParser.AlterStatementSuffixLocationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixSkewedby}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixSkewedby(HiveParser.AlterStatementSuffixSkewedbyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixSkewedby}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixSkewedby(HiveParser.AlterStatementSuffixSkewedbyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixExchangePartition}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixExchangePartition(
            HiveParser.AlterStatementSuffixExchangePartitionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixExchangePartition}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixExchangePartition(
            HiveParser.AlterStatementSuffixExchangePartitionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixRenamePart}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixRenamePart(HiveParser.AlterStatementSuffixRenamePartContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixRenamePart}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixRenamePart(HiveParser.AlterStatementSuffixRenamePartContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixStatsPart}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixStatsPart(HiveParser.AlterStatementSuffixStatsPartContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixStatsPart}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixStatsPart(HiveParser.AlterStatementSuffixStatsPartContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixMergeFiles}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixMergeFiles(HiveParser.AlterStatementSuffixMergeFilesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixMergeFiles}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixMergeFiles(HiveParser.AlterStatementSuffixMergeFilesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixBucketNum}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixBucketNum(HiveParser.AlterStatementSuffixBucketNumContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixBucketNum}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixBucketNum(HiveParser.AlterStatementSuffixBucketNumContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createIndexStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateIndexStatement(HiveParser.CreateIndexStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createIndexStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateIndexStatement(HiveParser.CreateIndexStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#locationPath}.
     *
     * @param ctx the parse tree
     */
    void enterLocationPath(HiveParser.LocationPathContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#locationPath}.
     *
     * @param ctx the parse tree
     */
    void exitLocationPath(HiveParser.LocationPathContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropIndexStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDropIndexStatement(HiveParser.DropIndexStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropIndexStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDropIndexStatement(HiveParser.DropIndexStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tablePartitionPrefix}.
     *
     * @param ctx the parse tree
     */
    void enterTablePartitionPrefix(HiveParser.TablePartitionPrefixContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tablePartitionPrefix}.
     *
     * @param ctx the parse tree
     */
    void exitTablePartitionPrefix(HiveParser.TablePartitionPrefixContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#blocking}.
     *
     * @param ctx the parse tree
     */
    void enterBlocking(HiveParser.BlockingContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#blocking}.
     *
     * @param ctx the parse tree
     */
    void exitBlocking(HiveParser.BlockingContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixCompact}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixCompact(HiveParser.AlterStatementSuffixCompactContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixCompact}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixCompact(HiveParser.AlterStatementSuffixCompactContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterStatementSuffixSetOwner}.
     *
     * @param ctx the parse tree
     */
    void enterAlterStatementSuffixSetOwner(HiveParser.AlterStatementSuffixSetOwnerContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterStatementSuffixSetOwner}.
     *
     * @param ctx the parse tree
     */
    void exitAlterStatementSuffixSetOwner(HiveParser.AlterStatementSuffixSetOwnerContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#fileFormat}.
     *
     * @param ctx the parse tree
     */
    void enterFileFormat(HiveParser.FileFormatContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#fileFormat}.
     *
     * @param ctx the parse tree
     */
    void exitFileFormat(HiveParser.FileFormatContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#inputFileFormat}.
     *
     * @param ctx the parse tree
     */
    void enterInputFileFormat(HiveParser.InputFileFormatContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#inputFileFormat}.
     *
     * @param ctx the parse tree
     */
    void exitInputFileFormat(HiveParser.InputFileFormatContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tabTypeExpr}.
     *
     * @param ctx the parse tree
     */
    void enterTabTypeExpr(HiveParser.TabTypeExprContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tabTypeExpr}.
     *
     * @param ctx the parse tree
     */
    void exitTabTypeExpr(HiveParser.TabTypeExprContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#partTypeExpr}.
     *
     * @param ctx the parse tree
     */
    void enterPartTypeExpr(HiveParser.PartTypeExprContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#partTypeExpr}.
     *
     * @param ctx the parse tree
     */
    void exitPartTypeExpr(HiveParser.PartTypeExprContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tabPartColTypeExpr}.
     *
     * @param ctx the parse tree
     */
    void enterTabPartColTypeExpr(HiveParser.TabPartColTypeExprContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tabPartColTypeExpr}.
     *
     * @param ctx the parse tree
     */
    void exitTabPartColTypeExpr(HiveParser.TabPartColTypeExprContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#descStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDescStatement(HiveParser.DescStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#descStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDescStatement(HiveParser.DescStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#analyzeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterAnalyzeStatement(HiveParser.AnalyzeStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#analyzeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitAnalyzeStatement(HiveParser.AnalyzeStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowStatement(HiveParser.ShowStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowStatement(HiveParser.ShowStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#lockStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLockStatement(HiveParser.LockStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#lockStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLockStatement(HiveParser.LockStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#lockDatabase}.
     *
     * @param ctx the parse tree
     */
    void enterLockDatabase(HiveParser.LockDatabaseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#lockDatabase}.
     *
     * @param ctx the parse tree
     */
    void exitLockDatabase(HiveParser.LockDatabaseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#lockMode}.
     *
     * @param ctx the parse tree
     */
    void enterLockMode(HiveParser.LockModeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#lockMode}.
     *
     * @param ctx the parse tree
     */
    void exitLockMode(HiveParser.LockModeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#unlockStatement}.
     *
     * @param ctx the parse tree
     */
    void enterUnlockStatement(HiveParser.UnlockStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#unlockStatement}.
     *
     * @param ctx the parse tree
     */
    void exitUnlockStatement(HiveParser.UnlockStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#unlockDatabase}.
     *
     * @param ctx the parse tree
     */
    void enterUnlockDatabase(HiveParser.UnlockDatabaseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#unlockDatabase}.
     *
     * @param ctx the parse tree
     */
    void exitUnlockDatabase(HiveParser.UnlockDatabaseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createRoleStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateRoleStatement(HiveParser.CreateRoleStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createRoleStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateRoleStatement(HiveParser.CreateRoleStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropRoleStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDropRoleStatement(HiveParser.DropRoleStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropRoleStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDropRoleStatement(HiveParser.DropRoleStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#grantPrivileges}.
     *
     * @param ctx the parse tree
     */
    void enterGrantPrivileges(HiveParser.GrantPrivilegesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#grantPrivileges}.
     *
     * @param ctx the parse tree
     */
    void exitGrantPrivileges(HiveParser.GrantPrivilegesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#revokePrivileges}.
     *
     * @param ctx the parse tree
     */
    void enterRevokePrivileges(HiveParser.RevokePrivilegesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#revokePrivileges}.
     *
     * @param ctx the parse tree
     */
    void exitRevokePrivileges(HiveParser.RevokePrivilegesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#grantRole}.
     *
     * @param ctx the parse tree
     */
    void enterGrantRole(HiveParser.GrantRoleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#grantRole}.
     *
     * @param ctx the parse tree
     */
    void exitGrantRole(HiveParser.GrantRoleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#revokeRole}.
     *
     * @param ctx the parse tree
     */
    void enterRevokeRole(HiveParser.RevokeRoleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#revokeRole}.
     *
     * @param ctx the parse tree
     */
    void exitRevokeRole(HiveParser.RevokeRoleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#showRoleGrants}.
     *
     * @param ctx the parse tree
     */
    void enterShowRoleGrants(HiveParser.ShowRoleGrantsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#showRoleGrants}.
     *
     * @param ctx the parse tree
     */
    void exitShowRoleGrants(HiveParser.ShowRoleGrantsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#showRoles}.
     *
     * @param ctx the parse tree
     */
    void enterShowRoles(HiveParser.ShowRolesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#showRoles}.
     *
     * @param ctx the parse tree
     */
    void exitShowRoles(HiveParser.ShowRolesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#showCurrentRole}.
     *
     * @param ctx the parse tree
     */
    void enterShowCurrentRole(HiveParser.ShowCurrentRoleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#showCurrentRole}.
     *
     * @param ctx the parse tree
     */
    void exitShowCurrentRole(HiveParser.ShowCurrentRoleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#setRole}.
     *
     * @param ctx the parse tree
     */
    void enterSetRole(HiveParser.SetRoleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#setRole}.
     *
     * @param ctx the parse tree
     */
    void exitSetRole(HiveParser.SetRoleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#showGrants}.
     *
     * @param ctx the parse tree
     */
    void enterShowGrants(HiveParser.ShowGrantsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#showGrants}.
     *
     * @param ctx the parse tree
     */
    void exitShowGrants(HiveParser.ShowGrantsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#showRolePrincipals}.
     *
     * @param ctx the parse tree
     */
    void enterShowRolePrincipals(HiveParser.ShowRolePrincipalsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#showRolePrincipals}.
     *
     * @param ctx the parse tree
     */
    void exitShowRolePrincipals(HiveParser.ShowRolePrincipalsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#privilegeIncludeColObject}.
     *
     * @param ctx the parse tree
     */
    void enterPrivilegeIncludeColObject(HiveParser.PrivilegeIncludeColObjectContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#privilegeIncludeColObject}.
     *
     * @param ctx the parse tree
     */
    void exitPrivilegeIncludeColObject(HiveParser.PrivilegeIncludeColObjectContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#privilegeObject}.
     *
     * @param ctx the parse tree
     */
    void enterPrivilegeObject(HiveParser.PrivilegeObjectContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#privilegeObject}.
     *
     * @param ctx the parse tree
     */
    void exitPrivilegeObject(HiveParser.PrivilegeObjectContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#privObject}.
     *
     * @param ctx the parse tree
     */
    void enterPrivObject(HiveParser.PrivObjectContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#privObject}.
     *
     * @param ctx the parse tree
     */
    void exitPrivObject(HiveParser.PrivObjectContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#privObjectCols}.
     *
     * @param ctx the parse tree
     */
    void enterPrivObjectCols(HiveParser.PrivObjectColsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#privObjectCols}.
     *
     * @param ctx the parse tree
     */
    void exitPrivObjectCols(HiveParser.PrivObjectColsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#privilegeList}.
     *
     * @param ctx the parse tree
     */
    void enterPrivilegeList(HiveParser.PrivilegeListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#privilegeList}.
     *
     * @param ctx the parse tree
     */
    void exitPrivilegeList(HiveParser.PrivilegeListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#privlegeDef}.
     *
     * @param ctx the parse tree
     */
    void enterPrivlegeDef(HiveParser.PrivlegeDefContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#privlegeDef}.
     *
     * @param ctx the parse tree
     */
    void exitPrivlegeDef(HiveParser.PrivlegeDefContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#privilegeType}.
     *
     * @param ctx the parse tree
     */
    void enterPrivilegeType(HiveParser.PrivilegeTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#privilegeType}.
     *
     * @param ctx the parse tree
     */
    void exitPrivilegeType(HiveParser.PrivilegeTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#principalSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterPrincipalSpecification(HiveParser.PrincipalSpecificationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#principalSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitPrincipalSpecification(HiveParser.PrincipalSpecificationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#principalName}.
     *
     * @param ctx the parse tree
     */
    void enterPrincipalName(HiveParser.PrincipalNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#principalName}.
     *
     * @param ctx the parse tree
     */
    void exitPrincipalName(HiveParser.PrincipalNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#withGrantOption}.
     *
     * @param ctx the parse tree
     */
    void enterWithGrantOption(HiveParser.WithGrantOptionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#withGrantOption}.
     *
     * @param ctx the parse tree
     */
    void exitWithGrantOption(HiveParser.WithGrantOptionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#grantOptionFor}.
     *
     * @param ctx the parse tree
     */
    void enterGrantOptionFor(HiveParser.GrantOptionForContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#grantOptionFor}.
     *
     * @param ctx the parse tree
     */
    void exitGrantOptionFor(HiveParser.GrantOptionForContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#adminOptionFor}.
     *
     * @param ctx the parse tree
     */
    void enterAdminOptionFor(HiveParser.AdminOptionForContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#adminOptionFor}.
     *
     * @param ctx the parse tree
     */
    void exitAdminOptionFor(HiveParser.AdminOptionForContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#withAdminOption}.
     *
     * @param ctx the parse tree
     */
    void enterWithAdminOption(HiveParser.WithAdminOptionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#withAdminOption}.
     *
     * @param ctx the parse tree
     */
    void exitWithAdminOption(HiveParser.WithAdminOptionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#metastoreCheck}.
     *
     * @param ctx the parse tree
     */
    void enterMetastoreCheck(HiveParser.MetastoreCheckContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#metastoreCheck}.
     *
     * @param ctx the parse tree
     */
    void exitMetastoreCheck(HiveParser.MetastoreCheckContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#resourceList}.
     *
     * @param ctx the parse tree
     */
    void enterResourceList(HiveParser.ResourceListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#resourceList}.
     *
     * @param ctx the parse tree
     */
    void exitResourceList(HiveParser.ResourceListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#resource}.
     *
     * @param ctx the parse tree
     */
    void enterResource(HiveParser.ResourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#resource}.
     *
     * @param ctx the parse tree
     */
    void exitResource(HiveParser.ResourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#resourceType}.
     *
     * @param ctx the parse tree
     */
    void enterResourceType(HiveParser.ResourceTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#resourceType}.
     *
     * @param ctx the parse tree
     */
    void exitResourceType(HiveParser.ResourceTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateFunctionStatement(HiveParser.CreateFunctionStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateFunctionStatement(HiveParser.CreateFunctionStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDropFunctionStatement(HiveParser.DropFunctionStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDropFunctionStatement(HiveParser.DropFunctionStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#reloadFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReloadFunctionStatement(HiveParser.ReloadFunctionStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#reloadFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReloadFunctionStatement(HiveParser.ReloadFunctionStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createMacroStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateMacroStatement(HiveParser.CreateMacroStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createMacroStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateMacroStatement(HiveParser.CreateMacroStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropMacroStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDropMacroStatement(HiveParser.DropMacroStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropMacroStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDropMacroStatement(HiveParser.DropMacroStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createViewStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateViewStatement(HiveParser.CreateViewStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createViewStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateViewStatement(HiveParser.CreateViewStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createMaterializedViewStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateMaterializedViewStatement(
            HiveParser.CreateMaterializedViewStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createMaterializedViewStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateMaterializedViewStatement(HiveParser.CreateMaterializedViewStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#viewPartition}.
     *
     * @param ctx the parse tree
     */
    void enterViewPartition(HiveParser.ViewPartitionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#viewPartition}.
     *
     * @param ctx the parse tree
     */
    void exitViewPartition(HiveParser.ViewPartitionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropViewStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDropViewStatement(HiveParser.DropViewStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropViewStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDropViewStatement(HiveParser.DropViewStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropMaterializedViewStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDropMaterializedViewStatement(HiveParser.DropMaterializedViewStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropMaterializedViewStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDropMaterializedViewStatement(HiveParser.DropMaterializedViewStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#showFunctionIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterShowFunctionIdentifier(HiveParser.ShowFunctionIdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#showFunctionIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitShowFunctionIdentifier(HiveParser.ShowFunctionIdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#showStmtIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterShowStmtIdentifier(HiveParser.ShowStmtIdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#showStmtIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitShowStmtIdentifier(HiveParser.ShowStmtIdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableComment}.
     *
     * @param ctx the parse tree
     */
    void enterTableComment(HiveParser.TableCommentContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableComment}.
     *
     * @param ctx the parse tree
     */
    void exitTableComment(HiveParser.TableCommentContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tablePartition}.
     *
     * @param ctx the parse tree
     */
    void enterTablePartition(HiveParser.TablePartitionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tablePartition}.
     *
     * @param ctx the parse tree
     */
    void exitTablePartition(HiveParser.TablePartitionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableBuckets}.
     *
     * @param ctx the parse tree
     */
    void enterTableBuckets(HiveParser.TableBucketsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableBuckets}.
     *
     * @param ctx the parse tree
     */
    void exitTableBuckets(HiveParser.TableBucketsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableSkewed}.
     *
     * @param ctx the parse tree
     */
    void enterTableSkewed(HiveParser.TableSkewedContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableSkewed}.
     *
     * @param ctx the parse tree
     */
    void exitTableSkewed(HiveParser.TableSkewedContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#rowFormat}.
     *
     * @param ctx the parse tree
     */
    void enterRowFormat(HiveParser.RowFormatContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#rowFormat}.
     *
     * @param ctx the parse tree
     */
    void exitRowFormat(HiveParser.RowFormatContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#recordReader}.
     *
     * @param ctx the parse tree
     */
    void enterRecordReader(HiveParser.RecordReaderContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#recordReader}.
     *
     * @param ctx the parse tree
     */
    void exitRecordReader(HiveParser.RecordReaderContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#recordWriter}.
     *
     * @param ctx the parse tree
     */
    void enterRecordWriter(HiveParser.RecordWriterContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#recordWriter}.
     *
     * @param ctx the parse tree
     */
    void exitRecordWriter(HiveParser.RecordWriterContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#rowFormatSerde}.
     *
     * @param ctx the parse tree
     */
    void enterRowFormatSerde(HiveParser.RowFormatSerdeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#rowFormatSerde}.
     *
     * @param ctx the parse tree
     */
    void exitRowFormatSerde(HiveParser.RowFormatSerdeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#rowFormatDelimited}.
     *
     * @param ctx the parse tree
     */
    void enterRowFormatDelimited(HiveParser.RowFormatDelimitedContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#rowFormatDelimited}.
     *
     * @param ctx the parse tree
     */
    void exitRowFormatDelimited(HiveParser.RowFormatDelimitedContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableRowFormat}.
     *
     * @param ctx the parse tree
     */
    void enterTableRowFormat(HiveParser.TableRowFormatContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableRowFormat}.
     *
     * @param ctx the parse tree
     */
    void exitTableRowFormat(HiveParser.TableRowFormatContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tablePropertiesPrefixed}.
     *
     * @param ctx the parse tree
     */
    void enterTablePropertiesPrefixed(HiveParser.TablePropertiesPrefixedContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tablePropertiesPrefixed}.
     *
     * @param ctx the parse tree
     */
    void exitTablePropertiesPrefixed(HiveParser.TablePropertiesPrefixedContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableProperties}.
     *
     * @param ctx the parse tree
     */
    void enterTableProperties(HiveParser.TablePropertiesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableProperties}.
     *
     * @param ctx the parse tree
     */
    void exitTableProperties(HiveParser.TablePropertiesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tablePropertiesList}.
     *
     * @param ctx the parse tree
     */
    void enterTablePropertiesList(HiveParser.TablePropertiesListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tablePropertiesList}.
     *
     * @param ctx the parse tree
     */
    void exitTablePropertiesList(HiveParser.TablePropertiesListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#keyValueProperty}.
     *
     * @param ctx the parse tree
     */
    void enterKeyValueProperty(HiveParser.KeyValuePropertyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#keyValueProperty}.
     *
     * @param ctx the parse tree
     */
    void exitKeyValueProperty(HiveParser.KeyValuePropertyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#keyProperty}.
     *
     * @param ctx the parse tree
     */
    void enterKeyProperty(HiveParser.KeyPropertyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#keyProperty}.
     *
     * @param ctx the parse tree
     */
    void exitKeyProperty(HiveParser.KeyPropertyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableRowFormatFieldIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterTableRowFormatFieldIdentifier(HiveParser.TableRowFormatFieldIdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableRowFormatFieldIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitTableRowFormatFieldIdentifier(HiveParser.TableRowFormatFieldIdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableRowFormatCollItemsIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterTableRowFormatCollItemsIdentifier(
            HiveParser.TableRowFormatCollItemsIdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableRowFormatCollItemsIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitTableRowFormatCollItemsIdentifier(
            HiveParser.TableRowFormatCollItemsIdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableRowFormatMapKeysIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterTableRowFormatMapKeysIdentifier(
            HiveParser.TableRowFormatMapKeysIdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableRowFormatMapKeysIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitTableRowFormatMapKeysIdentifier(HiveParser.TableRowFormatMapKeysIdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableRowFormatLinesIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterTableRowFormatLinesIdentifier(HiveParser.TableRowFormatLinesIdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableRowFormatLinesIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitTableRowFormatLinesIdentifier(HiveParser.TableRowFormatLinesIdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableRowNullFormat}.
     *
     * @param ctx the parse tree
     */
    void enterTableRowNullFormat(HiveParser.TableRowNullFormatContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableRowNullFormat}.
     *
     * @param ctx the parse tree
     */
    void exitTableRowNullFormat(HiveParser.TableRowNullFormatContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableFileFormat}.
     *
     * @param ctx the parse tree
     */
    void enterTableFileFormat(HiveParser.TableFileFormatContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableFileFormat}.
     *
     * @param ctx the parse tree
     */
    void exitTableFileFormat(HiveParser.TableFileFormatContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableLocation}.
     *
     * @param ctx the parse tree
     */
    void enterTableLocation(HiveParser.TableLocationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableLocation}.
     *
     * @param ctx the parse tree
     */
    void exitTableLocation(HiveParser.TableLocationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameTypeList}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameTypeList(HiveParser.ColumnNameTypeListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameTypeList}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameTypeList(HiveParser.ColumnNameTypeListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameTypeOrConstraintList}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameTypeOrConstraintList(HiveParser.ColumnNameTypeOrConstraintListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameTypeOrConstraintList}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameTypeOrConstraintList(HiveParser.ColumnNameTypeOrConstraintListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameColonTypeList}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameColonTypeList(HiveParser.ColumnNameColonTypeListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameColonTypeList}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameColonTypeList(HiveParser.ColumnNameColonTypeListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameList}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameList(HiveParser.ColumnNameListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameList}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameList(HiveParser.ColumnNameListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnName}.
     *
     * @param ctx the parse tree
     */
    void enterColumnName(HiveParser.ColumnNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnName}.
     *
     * @param ctx the parse tree
     */
    void exitColumnName(HiveParser.ColumnNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#extColumnName}.
     *
     * @param ctx the parse tree
     */
    void enterExtColumnName(HiveParser.ExtColumnNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#extColumnName}.
     *
     * @param ctx the parse tree
     */
    void exitExtColumnName(HiveParser.ExtColumnNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameOrderList}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameOrderList(HiveParser.ColumnNameOrderListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameOrderList}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameOrderList(HiveParser.ColumnNameOrderListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnParenthesesList}.
     *
     * @param ctx the parse tree
     */
    void enterColumnParenthesesList(HiveParser.ColumnParenthesesListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnParenthesesList}.
     *
     * @param ctx the parse tree
     */
    void exitColumnParenthesesList(HiveParser.ColumnParenthesesListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#enableValidateSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterEnableValidateSpecification(HiveParser.EnableValidateSpecificationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#enableValidateSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitEnableValidateSpecification(HiveParser.EnableValidateSpecificationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#enableSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterEnableSpecification(HiveParser.EnableSpecificationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#enableSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitEnableSpecification(HiveParser.EnableSpecificationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#validateSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterValidateSpecification(HiveParser.ValidateSpecificationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#validateSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitValidateSpecification(HiveParser.ValidateSpecificationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#enforcedSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterEnforcedSpecification(HiveParser.EnforcedSpecificationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#enforcedSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitEnforcedSpecification(HiveParser.EnforcedSpecificationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#relySpecification}.
     *
     * @param ctx the parse tree
     */
    void enterRelySpecification(HiveParser.RelySpecificationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#relySpecification}.
     *
     * @param ctx the parse tree
     */
    void exitRelySpecification(HiveParser.RelySpecificationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterCreateConstraint(HiveParser.CreateConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitCreateConstraint(HiveParser.CreateConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterConstraintWithName}.
     *
     * @param ctx the parse tree
     */
    void enterAlterConstraintWithName(HiveParser.AlterConstraintWithNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterConstraintWithName}.
     *
     * @param ctx the parse tree
     */
    void exitAlterConstraintWithName(HiveParser.AlterConstraintWithNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#pkConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterPkConstraint(HiveParser.PkConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#pkConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitPkConstraint(HiveParser.PkConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#createForeignKey}.
     *
     * @param ctx the parse tree
     */
    void enterCreateForeignKey(HiveParser.CreateForeignKeyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#createForeignKey}.
     *
     * @param ctx the parse tree
     */
    void exitCreateForeignKey(HiveParser.CreateForeignKeyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterForeignKeyWithName}.
     *
     * @param ctx the parse tree
     */
    void enterAlterForeignKeyWithName(HiveParser.AlterForeignKeyWithNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterForeignKeyWithName}.
     *
     * @param ctx the parse tree
     */
    void exitAlterForeignKeyWithName(HiveParser.AlterForeignKeyWithNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedValueElement}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedValueElement(HiveParser.SkewedValueElementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedValueElement}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedValueElement(HiveParser.SkewedValueElementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedColumnValuePairList}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedColumnValuePairList(HiveParser.SkewedColumnValuePairListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedColumnValuePairList}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedColumnValuePairList(HiveParser.SkewedColumnValuePairListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedColumnValuePair}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedColumnValuePair(HiveParser.SkewedColumnValuePairContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedColumnValuePair}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedColumnValuePair(HiveParser.SkewedColumnValuePairContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedColumnValues}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedColumnValues(HiveParser.SkewedColumnValuesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedColumnValues}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedColumnValues(HiveParser.SkewedColumnValuesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedColumnValue}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedColumnValue(HiveParser.SkewedColumnValueContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedColumnValue}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedColumnValue(HiveParser.SkewedColumnValueContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#skewedValueLocationElement}.
     *
     * @param ctx the parse tree
     */
    void enterSkewedValueLocationElement(HiveParser.SkewedValueLocationElementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#skewedValueLocationElement}.
     *
     * @param ctx the parse tree
     */
    void exitSkewedValueLocationElement(HiveParser.SkewedValueLocationElementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#orderSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterOrderSpecification(HiveParser.OrderSpecificationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#orderSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitOrderSpecification(HiveParser.OrderSpecificationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#nullOrdering}.
     *
     * @param ctx the parse tree
     */
    void enterNullOrdering(HiveParser.NullOrderingContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#nullOrdering}.
     *
     * @param ctx the parse tree
     */
    void exitNullOrdering(HiveParser.NullOrderingContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameOrder}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameOrder(HiveParser.ColumnNameOrderContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameOrder}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameOrder(HiveParser.ColumnNameOrderContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameCommentList}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameCommentList(HiveParser.ColumnNameCommentListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameCommentList}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameCommentList(HiveParser.ColumnNameCommentListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameComment}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameComment(HiveParser.ColumnNameCommentContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameComment}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameComment(HiveParser.ColumnNameCommentContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnRefOrder}.
     *
     * @param ctx the parse tree
     */
    void enterColumnRefOrder(HiveParser.ColumnRefOrderContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnRefOrder}.
     *
     * @param ctx the parse tree
     */
    void exitColumnRefOrder(HiveParser.ColumnRefOrderContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameType}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameType(HiveParser.ColumnNameTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameType}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameType(HiveParser.ColumnNameTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameTypeOrConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameTypeOrConstraint(HiveParser.ColumnNameTypeOrConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameTypeOrConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameTypeOrConstraint(HiveParser.ColumnNameTypeOrConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterTableConstraint(HiveParser.TableConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitTableConstraint(HiveParser.TableConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameTypeConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameTypeConstraint(HiveParser.ColumnNameTypeConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameTypeConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameTypeConstraint(HiveParser.ColumnNameTypeConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterColumnConstraint(HiveParser.ColumnConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitColumnConstraint(HiveParser.ColumnConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#foreignKeyConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterForeignKeyConstraint(HiveParser.ForeignKeyConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#foreignKeyConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitForeignKeyConstraint(HiveParser.ForeignKeyConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#colConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterColConstraint(HiveParser.ColConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#colConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitColConstraint(HiveParser.ColConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterColumnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterAlterColumnConstraint(HiveParser.AlterColumnConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterColumnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitAlterColumnConstraint(HiveParser.AlterColumnConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterForeignKeyConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterAlterForeignKeyConstraint(HiveParser.AlterForeignKeyConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterForeignKeyConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitAlterForeignKeyConstraint(HiveParser.AlterForeignKeyConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#alterColConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterAlterColConstraint(HiveParser.AlterColConstraintContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#alterColConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitAlterColConstraint(HiveParser.AlterColConstraintContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableConstraintPrimaryKey}.
     *
     * @param ctx the parse tree
     */
    void enterTableConstraintPrimaryKey(HiveParser.TableConstraintPrimaryKeyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableConstraintPrimaryKey}.
     *
     * @param ctx the parse tree
     */
    void exitTableConstraintPrimaryKey(HiveParser.TableConstraintPrimaryKeyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#constraintOptsCreate}.
     *
     * @param ctx the parse tree
     */
    void enterConstraintOptsCreate(HiveParser.ConstraintOptsCreateContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#constraintOptsCreate}.
     *
     * @param ctx the parse tree
     */
    void exitConstraintOptsCreate(HiveParser.ConstraintOptsCreateContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#constraintOptsAlter}.
     *
     * @param ctx the parse tree
     */
    void enterConstraintOptsAlter(HiveParser.ConstraintOptsAlterContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#constraintOptsAlter}.
     *
     * @param ctx the parse tree
     */
    void exitConstraintOptsAlter(HiveParser.ConstraintOptsAlterContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnNameColonType}.
     *
     * @param ctx the parse tree
     */
    void enterColumnNameColonType(HiveParser.ColumnNameColonTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnNameColonType}.
     *
     * @param ctx the parse tree
     */
    void exitColumnNameColonType(HiveParser.ColumnNameColonTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#colType}.
     *
     * @param ctx the parse tree
     */
    void enterColType(HiveParser.ColTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#colType}.
     *
     * @param ctx the parse tree
     */
    void exitColType(HiveParser.ColTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#colTypeList}.
     *
     * @param ctx the parse tree
     */
    void enterColTypeList(HiveParser.ColTypeListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#colTypeList}.
     *
     * @param ctx the parse tree
     */
    void exitColTypeList(HiveParser.ColTypeListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#type_db_col}.
     *
     * @param ctx the parse tree
     */
    void enterType_db_col(HiveParser.Type_db_colContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#type_db_col}.
     *
     * @param ctx the parse tree
     */
    void exitType_db_col(HiveParser.Type_db_colContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitiveType(HiveParser.PrimitiveTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitiveType(HiveParser.PrimitiveTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#listType}.
     *
     * @param ctx the parse tree
     */
    void enterListType(HiveParser.ListTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#listType}.
     *
     * @param ctx the parse tree
     */
    void exitListType(HiveParser.ListTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#structType}.
     *
     * @param ctx the parse tree
     */
    void enterStructType(HiveParser.StructTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#structType}.
     *
     * @param ctx the parse tree
     */
    void exitStructType(HiveParser.StructTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#mapType}.
     *
     * @param ctx the parse tree
     */
    void enterMapType(HiveParser.MapTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#mapType}.
     *
     * @param ctx the parse tree
     */
    void exitMapType(HiveParser.MapTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#unionType}.
     *
     * @param ctx the parse tree
     */
    void enterUnionType(HiveParser.UnionTypeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#unionType}.
     *
     * @param ctx the parse tree
     */
    void exitUnionType(HiveParser.UnionTypeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#setOperator}.
     *
     * @param ctx the parse tree
     */
    void enterSetOperator(HiveParser.SetOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#setOperator}.
     *
     * @param ctx the parse tree
     */
    void exitSetOperator(HiveParser.SetOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#queryStatementExpression}.
     *
     * @param ctx the parse tree
     */
    void enterQueryStatementExpression(HiveParser.QueryStatementExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#queryStatementExpression}.
     *
     * @param ctx the parse tree
     */
    void exitQueryStatementExpression(HiveParser.QueryStatementExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#queryStatementExpressionBody}.
     *
     * @param ctx the parse tree
     */
    void enterQueryStatementExpressionBody(HiveParser.QueryStatementExpressionBodyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#queryStatementExpressionBody}.
     *
     * @param ctx the parse tree
     */
    void exitQueryStatementExpressionBody(HiveParser.QueryStatementExpressionBodyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#withClause}.
     *
     * @param ctx the parse tree
     */
    void enterWithClause(HiveParser.WithClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#withClause}.
     *
     * @param ctx the parse tree
     */
    void exitWithClause(HiveParser.WithClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#cteStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCteStatement(HiveParser.CteStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#cteStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCteStatement(HiveParser.CteStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#fromStatement}.
     *
     * @param ctx the parse tree
     */
    void enterFromStatement(HiveParser.FromStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#fromStatement}.
     *
     * @param ctx the parse tree
     */
    void exitFromStatement(HiveParser.FromStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#singleFromStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSingleFromStatement(HiveParser.SingleFromStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#singleFromStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSingleFromStatement(HiveParser.SingleFromStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#regularBody}.
     *
     * @param ctx the parse tree
     */
    void enterRegularBody(HiveParser.RegularBodyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#regularBody}.
     *
     * @param ctx the parse tree
     */
    void exitRegularBody(HiveParser.RegularBodyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#atomSelectStatement}.
     *
     * @param ctx the parse tree
     */
    void enterAtomSelectStatement(HiveParser.AtomSelectStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#atomSelectStatement}.
     *
     * @param ctx the parse tree
     */
    void exitAtomSelectStatement(HiveParser.AtomSelectStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSelectStatement(HiveParser.SelectStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSelectStatement(HiveParser.SelectStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#setOpSelectStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetOpSelectStatement(HiveParser.SetOpSelectStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#setOpSelectStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetOpSelectStatement(HiveParser.SetOpSelectStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#selectStatementWithCTE}.
     *
     * @param ctx the parse tree
     */
    void enterSelectStatementWithCTE(HiveParser.SelectStatementWithCTEContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#selectStatementWithCTE}.
     *
     * @param ctx the parse tree
     */
    void exitSelectStatementWithCTE(HiveParser.SelectStatementWithCTEContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#body}.
     *
     * @param ctx the parse tree
     */
    void enterBody(HiveParser.BodyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#body}.
     *
     * @param ctx the parse tree
     */
    void exitBody(HiveParser.BodyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#insertClause}.
     *
     * @param ctx the parse tree
     */
    void enterInsertClause(HiveParser.InsertClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#insertClause}.
     *
     * @param ctx the parse tree
     */
    void exitInsertClause(HiveParser.InsertClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#destination}.
     *
     * @param ctx the parse tree
     */
    void enterDestination(HiveParser.DestinationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#destination}.
     *
     * @param ctx the parse tree
     */
    void exitDestination(HiveParser.DestinationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#limitClause}.
     *
     * @param ctx the parse tree
     */
    void enterLimitClause(HiveParser.LimitClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#limitClause}.
     *
     * @param ctx the parse tree
     */
    void exitLimitClause(HiveParser.LimitClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#deleteStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDeleteStatement(HiveParser.DeleteStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#deleteStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDeleteStatement(HiveParser.DeleteStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnAssignmentClause}.
     *
     * @param ctx the parse tree
     */
    void enterColumnAssignmentClause(HiveParser.ColumnAssignmentClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnAssignmentClause}.
     *
     * @param ctx the parse tree
     */
    void exitColumnAssignmentClause(HiveParser.ColumnAssignmentClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#setColumnsClause}.
     *
     * @param ctx the parse tree
     */
    void enterSetColumnsClause(HiveParser.SetColumnsClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#setColumnsClause}.
     *
     * @param ctx the parse tree
     */
    void exitSetColumnsClause(HiveParser.SetColumnsClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#updateStatement}.
     *
     * @param ctx the parse tree
     */
    void enterUpdateStatement(HiveParser.UpdateStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#updateStatement}.
     *
     * @param ctx the parse tree
     */
    void exitUpdateStatement(HiveParser.UpdateStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#sqlTransactionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSqlTransactionStatement(HiveParser.SqlTransactionStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#sqlTransactionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSqlTransactionStatement(HiveParser.SqlTransactionStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#startTransactionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterStartTransactionStatement(HiveParser.StartTransactionStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#startTransactionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitStartTransactionStatement(HiveParser.StartTransactionStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#transactionMode}.
     *
     * @param ctx the parse tree
     */
    void enterTransactionMode(HiveParser.TransactionModeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#transactionMode}.
     *
     * @param ctx the parse tree
     */
    void exitTransactionMode(HiveParser.TransactionModeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#transactionAccessMode}.
     *
     * @param ctx the parse tree
     */
    void enterTransactionAccessMode(HiveParser.TransactionAccessModeContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#transactionAccessMode}.
     *
     * @param ctx the parse tree
     */
    void exitTransactionAccessMode(HiveParser.TransactionAccessModeContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#isolationLevel}.
     *
     * @param ctx the parse tree
     */
    void enterIsolationLevel(HiveParser.IsolationLevelContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#isolationLevel}.
     *
     * @param ctx the parse tree
     */
    void exitIsolationLevel(HiveParser.IsolationLevelContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#levelOfIsolation}.
     *
     * @param ctx the parse tree
     */
    void enterLevelOfIsolation(HiveParser.LevelOfIsolationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#levelOfIsolation}.
     *
     * @param ctx the parse tree
     */
    void exitLevelOfIsolation(HiveParser.LevelOfIsolationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#commitStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCommitStatement(HiveParser.CommitStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#commitStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCommitStatement(HiveParser.CommitStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#rollbackStatement}.
     *
     * @param ctx the parse tree
     */
    void enterRollbackStatement(HiveParser.RollbackStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#rollbackStatement}.
     *
     * @param ctx the parse tree
     */
    void exitRollbackStatement(HiveParser.RollbackStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#setAutoCommitStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetAutoCommitStatement(HiveParser.SetAutoCommitStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#setAutoCommitStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetAutoCommitStatement(HiveParser.SetAutoCommitStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#abortTransactionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterAbortTransactionStatement(HiveParser.AbortTransactionStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#abortTransactionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitAbortTransactionStatement(HiveParser.AbortTransactionStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#mergeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterMergeStatement(HiveParser.MergeStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#mergeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitMergeStatement(HiveParser.MergeStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#whenClauses}.
     *
     * @param ctx the parse tree
     */
    void enterWhenClauses(HiveParser.WhenClausesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#whenClauses}.
     *
     * @param ctx the parse tree
     */
    void exitWhenClauses(HiveParser.WhenClausesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#whenNotMatchedClause}.
     *
     * @param ctx the parse tree
     */
    void enterWhenNotMatchedClause(HiveParser.WhenNotMatchedClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#whenNotMatchedClause}.
     *
     * @param ctx the parse tree
     */
    void exitWhenNotMatchedClause(HiveParser.WhenNotMatchedClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#whenMatchedAndClause}.
     *
     * @param ctx the parse tree
     */
    void enterWhenMatchedAndClause(HiveParser.WhenMatchedAndClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#whenMatchedAndClause}.
     *
     * @param ctx the parse tree
     */
    void exitWhenMatchedAndClause(HiveParser.WhenMatchedAndClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#whenMatchedThenClause}.
     *
     * @param ctx the parse tree
     */
    void enterWhenMatchedThenClause(HiveParser.WhenMatchedThenClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#whenMatchedThenClause}.
     *
     * @param ctx the parse tree
     */
    void exitWhenMatchedThenClause(HiveParser.WhenMatchedThenClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#updateOrDelete}.
     *
     * @param ctx the parse tree
     */
    void enterUpdateOrDelete(HiveParser.UpdateOrDeleteContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#updateOrDelete}.
     *
     * @param ctx the parse tree
     */
    void exitUpdateOrDelete(HiveParser.UpdateOrDeleteContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#killQueryStatement}.
     *
     * @param ctx the parse tree
     */
    void enterKillQueryStatement(HiveParser.KillQueryStatementContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#killQueryStatement}.
     *
     * @param ctx the parse tree
     */
    void exitKillQueryStatement(HiveParser.KillQueryStatementContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#selectClause}.
     *
     * @param ctx the parse tree
     */
    void enterSelectClause(HiveParser.SelectClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#selectClause}.
     *
     * @param ctx the parse tree
     */
    void exitSelectClause(HiveParser.SelectClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#selectList}.
     *
     * @param ctx the parse tree
     */
    void enterSelectList(HiveParser.SelectListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#selectList}.
     *
     * @param ctx the parse tree
     */
    void exitSelectList(HiveParser.SelectListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#selectTrfmClause}.
     *
     * @param ctx the parse tree
     */
    void enterSelectTrfmClause(HiveParser.SelectTrfmClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#selectTrfmClause}.
     *
     * @param ctx the parse tree
     */
    void exitSelectTrfmClause(HiveParser.SelectTrfmClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#selectItem}.
     *
     * @param ctx the parse tree
     */
    void enterSelectItem(HiveParser.SelectItemContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#selectItem}.
     *
     * @param ctx the parse tree
     */
    void exitSelectItem(HiveParser.SelectItemContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#trfmClause}.
     *
     * @param ctx the parse tree
     */
    void enterTrfmClause(HiveParser.TrfmClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#trfmClause}.
     *
     * @param ctx the parse tree
     */
    void exitTrfmClause(HiveParser.TrfmClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#selectExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSelectExpression(HiveParser.SelectExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#selectExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSelectExpression(HiveParser.SelectExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#selectExpressionList}.
     *
     * @param ctx the parse tree
     */
    void enterSelectExpressionList(HiveParser.SelectExpressionListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#selectExpressionList}.
     *
     * @param ctx the parse tree
     */
    void exitSelectExpressionList(HiveParser.SelectExpressionListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#window_clause}.
     *
     * @param ctx the parse tree
     */
    void enterWindow_clause(HiveParser.Window_clauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#window_clause}.
     *
     * @param ctx the parse tree
     */
    void exitWindow_clause(HiveParser.Window_clauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#window_defn}.
     *
     * @param ctx the parse tree
     */
    void enterWindow_defn(HiveParser.Window_defnContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#window_defn}.
     *
     * @param ctx the parse tree
     */
    void exitWindow_defn(HiveParser.Window_defnContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#window_specification}.
     *
     * @param ctx the parse tree
     */
    void enterWindow_specification(HiveParser.Window_specificationContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#window_specification}.
     *
     * @param ctx the parse tree
     */
    void exitWindow_specification(HiveParser.Window_specificationContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#window_frame}.
     *
     * @param ctx the parse tree
     */
    void enterWindow_frame(HiveParser.Window_frameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#window_frame}.
     *
     * @param ctx the parse tree
     */
    void exitWindow_frame(HiveParser.Window_frameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#window_range_expression}.
     *
     * @param ctx the parse tree
     */
    void enterWindow_range_expression(HiveParser.Window_range_expressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#window_range_expression}.
     *
     * @param ctx the parse tree
     */
    void exitWindow_range_expression(HiveParser.Window_range_expressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#window_value_expression}.
     *
     * @param ctx the parse tree
     */
    void enterWindow_value_expression(HiveParser.Window_value_expressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#window_value_expression}.
     *
     * @param ctx the parse tree
     */
    void exitWindow_value_expression(HiveParser.Window_value_expressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#window_frame_start_boundary}.
     *
     * @param ctx the parse tree
     */
    void enterWindow_frame_start_boundary(HiveParser.Window_frame_start_boundaryContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#window_frame_start_boundary}.
     *
     * @param ctx the parse tree
     */
    void exitWindow_frame_start_boundary(HiveParser.Window_frame_start_boundaryContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#window_frame_boundary}.
     *
     * @param ctx the parse tree
     */
    void enterWindow_frame_boundary(HiveParser.Window_frame_boundaryContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#window_frame_boundary}.
     *
     * @param ctx the parse tree
     */
    void exitWindow_frame_boundary(HiveParser.Window_frame_boundaryContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableAllColumns}.
     *
     * @param ctx the parse tree
     */
    void enterTableAllColumns(HiveParser.TableAllColumnsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableAllColumns}.
     *
     * @param ctx the parse tree
     */
    void exitTableAllColumns(HiveParser.TableAllColumnsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableOrColumn}.
     *
     * @param ctx the parse tree
     */
    void enterTableOrColumn(HiveParser.TableOrColumnContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableOrColumn}.
     *
     * @param ctx the parse tree
     */
    void exitTableOrColumn(HiveParser.TableOrColumnContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#expressionList}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionList(HiveParser.ExpressionListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#expressionList}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionList(HiveParser.ExpressionListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#aliasList}.
     *
     * @param ctx the parse tree
     */
    void enterAliasList(HiveParser.AliasListContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#aliasList}.
     *
     * @param ctx the parse tree
     */
    void exitAliasList(HiveParser.AliasListContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#fromClause}.
     *
     * @param ctx the parse tree
     */
    void enterFromClause(HiveParser.FromClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#fromClause}.
     *
     * @param ctx the parse tree
     */
    void exitFromClause(HiveParser.FromClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#fromSource}.
     *
     * @param ctx the parse tree
     */
    void enterFromSource(HiveParser.FromSourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#fromSource}.
     *
     * @param ctx the parse tree
     */
    void exitFromSource(HiveParser.FromSourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#atomjoinSource}.
     *
     * @param ctx the parse tree
     */
    void enterAtomjoinSource(HiveParser.AtomjoinSourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#atomjoinSource}.
     *
     * @param ctx the parse tree
     */
    void exitAtomjoinSource(HiveParser.AtomjoinSourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#joinSource}.
     *
     * @param ctx the parse tree
     */
    void enterJoinSource(HiveParser.JoinSourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#joinSource}.
     *
     * @param ctx the parse tree
     */
    void exitJoinSource(HiveParser.JoinSourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#joinSourcePart}.
     *
     * @param ctx the parse tree
     */
    void enterJoinSourcePart(HiveParser.JoinSourcePartContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#joinSourcePart}.
     *
     * @param ctx the parse tree
     */
    void exitJoinSourcePart(HiveParser.JoinSourcePartContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#uniqueJoinSource}.
     *
     * @param ctx the parse tree
     */
    void enterUniqueJoinSource(HiveParser.UniqueJoinSourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#uniqueJoinSource}.
     *
     * @param ctx the parse tree
     */
    void exitUniqueJoinSource(HiveParser.UniqueJoinSourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#uniqueJoinExpr}.
     *
     * @param ctx the parse tree
     */
    void enterUniqueJoinExpr(HiveParser.UniqueJoinExprContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#uniqueJoinExpr}.
     *
     * @param ctx the parse tree
     */
    void exitUniqueJoinExpr(HiveParser.UniqueJoinExprContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#uniqueJoinToken}.
     *
     * @param ctx the parse tree
     */
    void enterUniqueJoinToken(HiveParser.UniqueJoinTokenContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#uniqueJoinToken}.
     *
     * @param ctx the parse tree
     */
    void exitUniqueJoinToken(HiveParser.UniqueJoinTokenContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#joinToken}.
     *
     * @param ctx the parse tree
     */
    void enterJoinToken(HiveParser.JoinTokenContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#joinToken}.
     *
     * @param ctx the parse tree
     */
    void exitJoinToken(HiveParser.JoinTokenContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#lateralView}.
     *
     * @param ctx the parse tree
     */
    void enterLateralView(HiveParser.LateralViewContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#lateralView}.
     *
     * @param ctx the parse tree
     */
    void exitLateralView(HiveParser.LateralViewContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableAlias}.
     *
     * @param ctx the parse tree
     */
    void enterTableAlias(HiveParser.TableAliasContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableAlias}.
     *
     * @param ctx the parse tree
     */
    void exitTableAlias(HiveParser.TableAliasContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableBucketSample}.
     *
     * @param ctx the parse tree
     */
    void enterTableBucketSample(HiveParser.TableBucketSampleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableBucketSample}.
     *
     * @param ctx the parse tree
     */
    void exitTableBucketSample(HiveParser.TableBucketSampleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#splitSample}.
     *
     * @param ctx the parse tree
     */
    void enterSplitSample(HiveParser.SplitSampleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#splitSample}.
     *
     * @param ctx the parse tree
     */
    void exitSplitSample(HiveParser.SplitSampleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableSample}.
     *
     * @param ctx the parse tree
     */
    void enterTableSample(HiveParser.TableSampleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableSample}.
     *
     * @param ctx the parse tree
     */
    void exitTableSample(HiveParser.TableSampleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableSource}.
     *
     * @param ctx the parse tree
     */
    void enterTableSource(HiveParser.TableSourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableSource}.
     *
     * @param ctx the parse tree
     */
    void exitTableSource(HiveParser.TableSourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#uniqueJoinTableSource}.
     *
     * @param ctx the parse tree
     */
    void enterUniqueJoinTableSource(HiveParser.UniqueJoinTableSourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#uniqueJoinTableSource}.
     *
     * @param ctx the parse tree
     */
    void exitUniqueJoinTableSource(HiveParser.UniqueJoinTableSourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableName}.
     *
     * @param ctx the parse tree
     */
    void enterTableName(HiveParser.TableNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableName}.
     *
     * @param ctx the parse tree
     */
    void exitTableName(HiveParser.TableNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#viewName}.
     *
     * @param ctx the parse tree
     */
    void enterViewName(HiveParser.ViewNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#viewName}.
     *
     * @param ctx the parse tree
     */
    void exitViewName(HiveParser.ViewNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#subQuerySource}.
     *
     * @param ctx the parse tree
     */
    void enterSubQuerySource(HiveParser.SubQuerySourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#subQuerySource}.
     *
     * @param ctx the parse tree
     */
    void exitSubQuerySource(HiveParser.SubQuerySourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#partitioningSpec}.
     *
     * @param ctx the parse tree
     */
    void enterPartitioningSpec(HiveParser.PartitioningSpecContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#partitioningSpec}.
     *
     * @param ctx the parse tree
     */
    void exitPartitioningSpec(HiveParser.PartitioningSpecContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#partitionTableFunctionSource}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionTableFunctionSource(HiveParser.PartitionTableFunctionSourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#partitionTableFunctionSource}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionTableFunctionSource(HiveParser.PartitionTableFunctionSourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#partitionedTableFunction}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionedTableFunction(HiveParser.PartitionedTableFunctionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#partitionedTableFunction}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionedTableFunction(HiveParser.PartitionedTableFunctionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#whereClause}.
     *
     * @param ctx the parse tree
     */
    void enterWhereClause(HiveParser.WhereClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#whereClause}.
     *
     * @param ctx the parse tree
     */
    void exitWhereClause(HiveParser.WhereClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#searchCondition}.
     *
     * @param ctx the parse tree
     */
    void enterSearchCondition(HiveParser.SearchConditionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#searchCondition}.
     *
     * @param ctx the parse tree
     */
    void exitSearchCondition(HiveParser.SearchConditionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#valuesClause}.
     *
     * @param ctx the parse tree
     */
    void enterValuesClause(HiveParser.ValuesClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#valuesClause}.
     *
     * @param ctx the parse tree
     */
    void exitValuesClause(HiveParser.ValuesClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#valuesTableConstructor}.
     *
     * @param ctx the parse tree
     */
    void enterValuesTableConstructor(HiveParser.ValuesTableConstructorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#valuesTableConstructor}.
     *
     * @param ctx the parse tree
     */
    void exitValuesTableConstructor(HiveParser.ValuesTableConstructorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#valueRowConstructor}.
     *
     * @param ctx the parse tree
     */
    void enterValueRowConstructor(HiveParser.ValueRowConstructorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#valueRowConstructor}.
     *
     * @param ctx the parse tree
     */
    void exitValueRowConstructor(HiveParser.ValueRowConstructorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#virtualTableSource}.
     *
     * @param ctx the parse tree
     */
    void enterVirtualTableSource(HiveParser.VirtualTableSourceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#virtualTableSource}.
     *
     * @param ctx the parse tree
     */
    void exitVirtualTableSource(HiveParser.VirtualTableSourceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#groupByClause}.
     *
     * @param ctx the parse tree
     */
    void enterGroupByClause(HiveParser.GroupByClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#groupByClause}.
     *
     * @param ctx the parse tree
     */
    void exitGroupByClause(HiveParser.GroupByClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#groupby_expression}.
     *
     * @param ctx the parse tree
     */
    void enterGroupby_expression(HiveParser.Groupby_expressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#groupby_expression}.
     *
     * @param ctx the parse tree
     */
    void exitGroupby_expression(HiveParser.Groupby_expressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#groupByEmpty}.
     *
     * @param ctx the parse tree
     */
    void enterGroupByEmpty(HiveParser.GroupByEmptyContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#groupByEmpty}.
     *
     * @param ctx the parse tree
     */
    void exitGroupByEmpty(HiveParser.GroupByEmptyContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#rollupStandard}.
     *
     * @param ctx the parse tree
     */
    void enterRollupStandard(HiveParser.RollupStandardContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#rollupStandard}.
     *
     * @param ctx the parse tree
     */
    void exitRollupStandard(HiveParser.RollupStandardContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#rollupOldSyntax}.
     *
     * @param ctx the parse tree
     */
    void enterRollupOldSyntax(HiveParser.RollupOldSyntaxContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#rollupOldSyntax}.
     *
     * @param ctx the parse tree
     */
    void exitRollupOldSyntax(HiveParser.RollupOldSyntaxContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#groupingSetExpression}.
     *
     * @param ctx the parse tree
     */
    void enterGroupingSetExpression(HiveParser.GroupingSetExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#groupingSetExpression}.
     *
     * @param ctx the parse tree
     */
    void exitGroupingSetExpression(HiveParser.GroupingSetExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#groupingSetExpressionMultiple}.
     *
     * @param ctx the parse tree
     */
    void enterGroupingSetExpressionMultiple(HiveParser.GroupingSetExpressionMultipleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#groupingSetExpressionMultiple}.
     *
     * @param ctx the parse tree
     */
    void exitGroupingSetExpressionMultiple(HiveParser.GroupingSetExpressionMultipleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#groupingExpressionSingle}.
     *
     * @param ctx the parse tree
     */
    void enterGroupingExpressionSingle(HiveParser.GroupingExpressionSingleContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#groupingExpressionSingle}.
     *
     * @param ctx the parse tree
     */
    void exitGroupingExpressionSingle(HiveParser.GroupingExpressionSingleContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#havingClause}.
     *
     * @param ctx the parse tree
     */
    void enterHavingClause(HiveParser.HavingClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#havingClause}.
     *
     * @param ctx the parse tree
     */
    void exitHavingClause(HiveParser.HavingClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#havingCondition}.
     *
     * @param ctx the parse tree
     */
    void enterHavingCondition(HiveParser.HavingConditionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#havingCondition}.
     *
     * @param ctx the parse tree
     */
    void exitHavingCondition(HiveParser.HavingConditionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#expressionsInParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionsInParenthesis(HiveParser.ExpressionsInParenthesisContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#expressionsInParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionsInParenthesis(HiveParser.ExpressionsInParenthesisContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#expressionsNotInParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionsNotInParenthesis(HiveParser.ExpressionsNotInParenthesisContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#expressionsNotInParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionsNotInParenthesis(HiveParser.ExpressionsNotInParenthesisContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#expressionPart}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionPart(HiveParser.ExpressionPartContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#expressionPart}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionPart(HiveParser.ExpressionPartContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#expressions}.
     *
     * @param ctx the parse tree
     */
    void enterExpressions(HiveParser.ExpressionsContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#expressions}.
     *
     * @param ctx the parse tree
     */
    void exitExpressions(HiveParser.ExpressionsContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnRefOrderInParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterColumnRefOrderInParenthesis(HiveParser.ColumnRefOrderInParenthesisContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnRefOrderInParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitColumnRefOrderInParenthesis(HiveParser.ColumnRefOrderInParenthesisContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#columnRefOrderNotInParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterColumnRefOrderNotInParenthesis(HiveParser.ColumnRefOrderNotInParenthesisContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#columnRefOrderNotInParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitColumnRefOrderNotInParenthesis(HiveParser.ColumnRefOrderNotInParenthesisContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#orderByClause}.
     *
     * @param ctx the parse tree
     */
    void enterOrderByClause(HiveParser.OrderByClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#orderByClause}.
     *
     * @param ctx the parse tree
     */
    void exitOrderByClause(HiveParser.OrderByClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#clusterByClause}.
     *
     * @param ctx the parse tree
     */
    void enterClusterByClause(HiveParser.ClusterByClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#clusterByClause}.
     *
     * @param ctx the parse tree
     */
    void exitClusterByClause(HiveParser.ClusterByClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#partitionByClause}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionByClause(HiveParser.PartitionByClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#partitionByClause}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionByClause(HiveParser.PartitionByClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#distributeByClause}.
     *
     * @param ctx the parse tree
     */
    void enterDistributeByClause(HiveParser.DistributeByClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#distributeByClause}.
     *
     * @param ctx the parse tree
     */
    void exitDistributeByClause(HiveParser.DistributeByClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#sortByClause}.
     *
     * @param ctx the parse tree
     */
    void enterSortByClause(HiveParser.SortByClauseContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#sortByClause}.
     *
     * @param ctx the parse tree
     */
    void exitSortByClause(HiveParser.SortByClauseContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#function}.
     *
     * @param ctx the parse tree
     */
    void enterFunction(HiveParser.FunctionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#function}.
     *
     * @param ctx the parse tree
     */
    void exitFunction(HiveParser.FunctionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#functionName}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionName(HiveParser.FunctionNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#functionName}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionName(HiveParser.FunctionNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#castExpression}.
     *
     * @param ctx the parse tree
     */
    void enterCastExpression(HiveParser.CastExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#castExpression}.
     *
     * @param ctx the parse tree
     */
    void exitCastExpression(HiveParser.CastExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#caseExpression}.
     *
     * @param ctx the parse tree
     */
    void enterCaseExpression(HiveParser.CaseExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#caseExpression}.
     *
     * @param ctx the parse tree
     */
    void exitCaseExpression(HiveParser.CaseExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#whenExpression}.
     *
     * @param ctx the parse tree
     */
    void enterWhenExpression(HiveParser.WhenExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#whenExpression}.
     *
     * @param ctx the parse tree
     */
    void exitWhenExpression(HiveParser.WhenExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#floorExpression}.
     *
     * @param ctx the parse tree
     */
    void enterFloorExpression(HiveParser.FloorExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#floorExpression}.
     *
     * @param ctx the parse tree
     */
    void exitFloorExpression(HiveParser.FloorExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#floorDateQualifiers}.
     *
     * @param ctx the parse tree
     */
    void enterFloorDateQualifiers(HiveParser.FloorDateQualifiersContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#floorDateQualifiers}.
     *
     * @param ctx the parse tree
     */
    void exitFloorDateQualifiers(HiveParser.FloorDateQualifiersContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#extractExpression}.
     *
     * @param ctx the parse tree
     */
    void enterExtractExpression(HiveParser.ExtractExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#extractExpression}.
     *
     * @param ctx the parse tree
     */
    void exitExtractExpression(HiveParser.ExtractExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#timeQualifiers}.
     *
     * @param ctx the parse tree
     */
    void enterTimeQualifiers(HiveParser.TimeQualifiersContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#timeQualifiers}.
     *
     * @param ctx the parse tree
     */
    void exitTimeQualifiers(HiveParser.TimeQualifiersContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterConstant(HiveParser.ConstantContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitConstant(HiveParser.ConstantContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#stringLiteralSequence}.
     *
     * @param ctx the parse tree
     */
    void enterStringLiteralSequence(HiveParser.StringLiteralSequenceContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#stringLiteralSequence}.
     *
     * @param ctx the parse tree
     */
    void exitStringLiteralSequence(HiveParser.StringLiteralSequenceContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#charSetStringLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterCharSetStringLiteral(HiveParser.CharSetStringLiteralContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#charSetStringLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitCharSetStringLiteral(HiveParser.CharSetStringLiteralContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dateLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterDateLiteral(HiveParser.DateLiteralContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dateLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitDateLiteral(HiveParser.DateLiteralContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#timestampLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterTimestampLiteral(HiveParser.TimestampLiteralContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#timestampLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitTimestampLiteral(HiveParser.TimestampLiteralContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#timestampLocalTZLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterTimestampLocalTZLiteral(HiveParser.TimestampLocalTZLiteralContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#timestampLocalTZLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitTimestampLocalTZLiteral(HiveParser.TimestampLocalTZLiteralContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#intervalValue}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalValue(HiveParser.IntervalValueContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#intervalValue}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalValue(HiveParser.IntervalValueContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#intervalLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalLiteral(HiveParser.IntervalLiteralContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#intervalLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalLiteral(HiveParser.IntervalLiteralContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#intervalExpression}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalExpression(HiveParser.IntervalExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#intervalExpression}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalExpression(HiveParser.IntervalExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#intervalQualifiers}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalQualifiers(HiveParser.IntervalQualifiersContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#intervalQualifiers}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalQualifiers(HiveParser.IntervalQualifiersContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#atomExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAtomExpression(HiveParser.AtomExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#atomExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAtomExpression(HiveParser.AtomExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceUnaryOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceUnaryOperator(HiveParser.PrecedenceUnaryOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceUnaryOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceUnaryOperator(HiveParser.PrecedenceUnaryOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#isCondition}.
     *
     * @param ctx the parse tree
     */
    void enterIsCondition(HiveParser.IsConditionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#isCondition}.
     *
     * @param ctx the parse tree
     */
    void exitIsCondition(HiveParser.IsConditionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceBitwiseXorOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceBitwiseXorOperator(HiveParser.PrecedenceBitwiseXorOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceBitwiseXorOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceBitwiseXorOperator(HiveParser.PrecedenceBitwiseXorOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceStarOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceStarOperator(HiveParser.PrecedenceStarOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceStarOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceStarOperator(HiveParser.PrecedenceStarOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedencePlusOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedencePlusOperator(HiveParser.PrecedencePlusOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedencePlusOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedencePlusOperator(HiveParser.PrecedencePlusOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceConcatenateOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceConcatenateOperator(HiveParser.PrecedenceConcatenateOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceConcatenateOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceConcatenateOperator(HiveParser.PrecedenceConcatenateOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceAmpersandOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceAmpersandOperator(HiveParser.PrecedenceAmpersandOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceAmpersandOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceAmpersandOperator(HiveParser.PrecedenceAmpersandOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceBitwiseOrOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceBitwiseOrOperator(HiveParser.PrecedenceBitwiseOrOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceBitwiseOrOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceBitwiseOrOperator(HiveParser.PrecedenceBitwiseOrOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceRegexpOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceRegexpOperator(HiveParser.PrecedenceRegexpOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceRegexpOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceRegexpOperator(HiveParser.PrecedenceRegexpOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceComparisonOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceComparisonOperator(HiveParser.PrecedenceComparisonOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceComparisonOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceComparisonOperator(HiveParser.PrecedenceComparisonOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceNotOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceNotOperator(HiveParser.PrecedenceNotOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceNotOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceNotOperator(HiveParser.PrecedenceNotOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceLogicOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceLogicOperator(HiveParser.PrecedenceLogicOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceLogicOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceLogicOperator(HiveParser.PrecedenceLogicOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(HiveParser.ExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(HiveParser.ExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceExpression(HiveParser.PrecedenceExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceExpression(HiveParser.PrecedenceExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#precedenceSimilarExpressionIn}.
     *
     * @param ctx the parse tree
     */
    void enterPrecedenceSimilarExpressionIn(HiveParser.PrecedenceSimilarExpressionInContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#precedenceSimilarExpressionIn}.
     *
     * @param ctx the parse tree
     */
    void exitPrecedenceSimilarExpressionIn(HiveParser.PrecedenceSimilarExpressionInContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#subQueryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSubQueryExpression(HiveParser.SubQueryExpressionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#subQueryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSubQueryExpression(HiveParser.SubQueryExpressionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#booleanValue}.
     *
     * @param ctx the parse tree
     */
    void enterBooleanValue(HiveParser.BooleanValueContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#booleanValue}.
     *
     * @param ctx the parse tree
     */
    void exitBooleanValue(HiveParser.BooleanValueContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#booleanValueTok}.
     *
     * @param ctx the parse tree
     */
    void enterBooleanValueTok(HiveParser.BooleanValueTokContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#booleanValueTok}.
     *
     * @param ctx the parse tree
     */
    void exitBooleanValueTok(HiveParser.BooleanValueTokContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#tableOrPartition}.
     *
     * @param ctx the parse tree
     */
    void enterTableOrPartition(HiveParser.TableOrPartitionContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#tableOrPartition}.
     *
     * @param ctx the parse tree
     */
    void exitTableOrPartition(HiveParser.TableOrPartitionContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#partitionSpec}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionSpec(HiveParser.PartitionSpecContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#partitionSpec}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionSpec(HiveParser.PartitionSpecContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#partitionVal}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionVal(HiveParser.PartitionValContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#partitionVal}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionVal(HiveParser.PartitionValContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropPartitionSpec}.
     *
     * @param ctx the parse tree
     */
    void enterDropPartitionSpec(HiveParser.DropPartitionSpecContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropPartitionSpec}.
     *
     * @param ctx the parse tree
     */
    void exitDropPartitionSpec(HiveParser.DropPartitionSpecContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropPartitionVal}.
     *
     * @param ctx the parse tree
     */
    void enterDropPartitionVal(HiveParser.DropPartitionValContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropPartitionVal}.
     *
     * @param ctx the parse tree
     */
    void exitDropPartitionVal(HiveParser.DropPartitionValContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#dropPartitionOperator}.
     *
     * @param ctx the parse tree
     */
    void enterDropPartitionOperator(HiveParser.DropPartitionOperatorContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#dropPartitionOperator}.
     *
     * @param ctx the parse tree
     */
    void exitDropPartitionOperator(HiveParser.DropPartitionOperatorContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#sysFuncNames}.
     *
     * @param ctx the parse tree
     */
    void enterSysFuncNames(HiveParser.SysFuncNamesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#sysFuncNames}.
     *
     * @param ctx the parse tree
     */
    void exitSysFuncNames(HiveParser.SysFuncNamesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#descFuncNames}.
     *
     * @param ctx the parse tree
     */
    void enterDescFuncNames(HiveParser.DescFuncNamesContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#descFuncNames}.
     *
     * @param ctx the parse tree
     */
    void exitDescFuncNames(HiveParser.DescFuncNamesContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifier(HiveParser.IdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifier(HiveParser.IdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#functionIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionIdentifier(HiveParser.FunctionIdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#functionIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionIdentifier(HiveParser.FunctionIdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#principalIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterPrincipalIdentifier(HiveParser.PrincipalIdentifierContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#principalIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitPrincipalIdentifier(HiveParser.PrincipalIdentifierContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#nonReserved}.
     *
     * @param ctx the parse tree
     */
    void enterNonReserved(HiveParser.NonReservedContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#nonReserved}.
     *
     * @param ctx the parse tree
     */
    void exitNonReserved(HiveParser.NonReservedContext ctx);
    /**
     * Enter a parse tree produced by {@link HiveParser#sql11ReservedKeywordsUsedAsFunctionName}.
     *
     * @param ctx the parse tree
     */
    void enterSql11ReservedKeywordsUsedAsFunctionName(
            HiveParser.Sql11ReservedKeywordsUsedAsFunctionNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HiveParser#sql11ReservedKeywordsUsedAsFunctionName}.
     *
     * @param ctx the parse tree
     */
    void exitSql11ReservedKeywordsUsedAsFunctionName(
            HiveParser.Sql11ReservedKeywordsUsedAsFunctionNameContext ctx);
}
