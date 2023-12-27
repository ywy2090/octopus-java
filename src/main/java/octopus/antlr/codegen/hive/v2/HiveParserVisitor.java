// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/hive/v2/HiveParser.g4
// by ANTLR 4.13.1
package octopus.antlr.codegen.hive.v2;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@link
 * HiveParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public interface HiveParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link HiveParser#statements}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatements(HiveParser.StatementsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#statementSeparator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementSeparator(HiveParser.StatementSeparatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#empty}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEmpty(HiveParser.EmptyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(HiveParser.StatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#explainStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExplainStatement(HiveParser.ExplainStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#explainOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExplainOption(HiveParser.ExplainOptionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#vectorizationOnly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVectorizationOnly(HiveParser.VectorizationOnlyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#vectorizatonDetail}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVectorizatonDetail(HiveParser.VectorizatonDetailContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#execStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExecStatement(HiveParser.ExecStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#loadStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadStatement(HiveParser.LoadStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#replicationClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReplicationClause(HiveParser.ReplicationClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#exportStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExportStatement(HiveParser.ExportStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#importStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportStatement(HiveParser.ImportStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#replDumpStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReplDumpStatement(HiveParser.ReplDumpStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#replLoadStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReplLoadStatement(HiveParser.ReplLoadStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#replConfigs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReplConfigs(HiveParser.ReplConfigsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#replConfigsList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReplConfigsList(HiveParser.ReplConfigsListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#replStatusStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReplStatusStatement(HiveParser.ReplStatusStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#ddlStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDdlStatement(HiveParser.DdlStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#ifExists}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfExists(HiveParser.IfExistsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#restrictOrCascade}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRestrictOrCascade(HiveParser.RestrictOrCascadeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#ifNotExists}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfNotExists(HiveParser.IfNotExistsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#rewriteEnabled}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRewriteEnabled(HiveParser.RewriteEnabledContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#rewriteDisabled}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRewriteDisabled(HiveParser.RewriteDisabledContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#storedAsDirs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStoredAsDirs(HiveParser.StoredAsDirsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#orReplace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrReplace(HiveParser.OrReplaceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createDatabaseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateDatabaseStatement(HiveParser.CreateDatabaseStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dbLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDbLocation(HiveParser.DbLocationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dbProperties}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDbProperties(HiveParser.DbPropertiesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dbPropertiesList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDbPropertiesList(HiveParser.DbPropertiesListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#switchDatabaseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSwitchDatabaseStatement(HiveParser.SwitchDatabaseStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropDatabaseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropDatabaseStatement(HiveParser.DropDatabaseStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#databaseComment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDatabaseComment(HiveParser.DatabaseCommentContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createTableStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateTableStatement(HiveParser.CreateTableStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#truncateTableStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTruncateTableStatement(HiveParser.TruncateTableStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropTableStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropTableStatement(HiveParser.DropTableStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatement(HiveParser.AlterStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterTableStatementSuffix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterTableStatementSuffix(HiveParser.AlterTableStatementSuffixContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterTblPartitionStatementSuffix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterTblPartitionStatementSuffix(HiveParser.AlterTblPartitionStatementSuffixContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementPartitionKeyType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementPartitionKeyType(HiveParser.AlterStatementPartitionKeyTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterViewStatementSuffix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterViewStatementSuffix(HiveParser.AlterViewStatementSuffixContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterMaterializedViewStatementSuffix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterMaterializedViewStatementSuffix(
            HiveParser.AlterMaterializedViewStatementSuffixContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterDatabaseStatementSuffix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterDatabaseStatementSuffix(HiveParser.AlterDatabaseStatementSuffixContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterDatabaseSuffixProperties}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterDatabaseSuffixProperties(HiveParser.AlterDatabaseSuffixPropertiesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterDatabaseSuffixSetOwner}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterDatabaseSuffixSetOwner(HiveParser.AlterDatabaseSuffixSetOwnerContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterDatabaseSuffixSetLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterDatabaseSuffixSetLocation(HiveParser.AlterDatabaseSuffixSetLocationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixRename}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixRename(HiveParser.AlterStatementSuffixRenameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixAddCol}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixAddCol(HiveParser.AlterStatementSuffixAddColContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixAddConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixAddConstraint(
            HiveParser.AlterStatementSuffixAddConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixDropConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixDropConstraint(
            HiveParser.AlterStatementSuffixDropConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixRenameCol}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixRenameCol(HiveParser.AlterStatementSuffixRenameColContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixUpdateStatsCol}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixUpdateStatsCol(
            HiveParser.AlterStatementSuffixUpdateStatsColContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixUpdateStats}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixUpdateStats(HiveParser.AlterStatementSuffixUpdateStatsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementChangeColPosition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementChangeColPosition(HiveParser.AlterStatementChangeColPositionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixAddPartitions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixAddPartitions(
            HiveParser.AlterStatementSuffixAddPartitionsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixAddPartitionsElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixAddPartitionsElement(
            HiveParser.AlterStatementSuffixAddPartitionsElementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixTouch}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixTouch(HiveParser.AlterStatementSuffixTouchContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixArchive}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixArchive(HiveParser.AlterStatementSuffixArchiveContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixUnArchive}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixUnArchive(HiveParser.AlterStatementSuffixUnArchiveContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#partitionLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionLocation(HiveParser.PartitionLocationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixDropPartitions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixDropPartitions(
            HiveParser.AlterStatementSuffixDropPartitionsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixProperties}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixProperties(HiveParser.AlterStatementSuffixPropertiesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterViewSuffixProperties}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterViewSuffixProperties(HiveParser.AlterViewSuffixPropertiesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterMaterializedViewSuffixRewrite}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterMaterializedViewSuffixRewrite(
            HiveParser.AlterMaterializedViewSuffixRewriteContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterMaterializedViewSuffixRebuild}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterMaterializedViewSuffixRebuild(
            HiveParser.AlterMaterializedViewSuffixRebuildContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixSerdeProperties}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixSerdeProperties(
            HiveParser.AlterStatementSuffixSerdePropertiesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterIndexStatementSuffix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterIndexStatementSuffix(HiveParser.AlterIndexStatementSuffixContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixFileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixFileFormat(HiveParser.AlterStatementSuffixFileFormatContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixClusterbySortby}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixClusterbySortby(
            HiveParser.AlterStatementSuffixClusterbySortbyContext ctx);
    /**
     * Visit a parse tree produced by {@link
     * HiveParser#alterTblPartitionStatementSuffixSkewedLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterTblPartitionStatementSuffixSkewedLocation(
            HiveParser.AlterTblPartitionStatementSuffixSkewedLocationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedLocations}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedLocations(HiveParser.SkewedLocationsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedLocationsList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedLocationsList(HiveParser.SkewedLocationsListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedLocationMap}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedLocationMap(HiveParser.SkewedLocationMapContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixLocation(HiveParser.AlterStatementSuffixLocationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixSkewedby}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixSkewedby(HiveParser.AlterStatementSuffixSkewedbyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixExchangePartition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixExchangePartition(
            HiveParser.AlterStatementSuffixExchangePartitionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixRenamePart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixRenamePart(HiveParser.AlterStatementSuffixRenamePartContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixStatsPart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixStatsPart(HiveParser.AlterStatementSuffixStatsPartContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixMergeFiles}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixMergeFiles(HiveParser.AlterStatementSuffixMergeFilesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixBucketNum}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixBucketNum(HiveParser.AlterStatementSuffixBucketNumContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createIndexStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateIndexStatement(HiveParser.CreateIndexStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#locationPath}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLocationPath(HiveParser.LocationPathContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropIndexStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropIndexStatement(HiveParser.DropIndexStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tablePartitionPrefix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTablePartitionPrefix(HiveParser.TablePartitionPrefixContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#blocking}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlocking(HiveParser.BlockingContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixCompact}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixCompact(HiveParser.AlterStatementSuffixCompactContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterStatementSuffixSetOwner}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterStatementSuffixSetOwner(HiveParser.AlterStatementSuffixSetOwnerContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#fileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFileFormat(HiveParser.FileFormatContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#inputFileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInputFileFormat(HiveParser.InputFileFormatContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tabTypeExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTabTypeExpr(HiveParser.TabTypeExprContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#partTypeExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartTypeExpr(HiveParser.PartTypeExprContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tabPartColTypeExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTabPartColTypeExpr(HiveParser.TabPartColTypeExprContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#descStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDescStatement(HiveParser.DescStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#analyzeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnalyzeStatement(HiveParser.AnalyzeStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowStatement(HiveParser.ShowStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#lockStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLockStatement(HiveParser.LockStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#lockDatabase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLockDatabase(HiveParser.LockDatabaseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#lockMode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLockMode(HiveParser.LockModeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#unlockStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnlockStatement(HiveParser.UnlockStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#unlockDatabase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnlockDatabase(HiveParser.UnlockDatabaseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createRoleStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateRoleStatement(HiveParser.CreateRoleStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropRoleStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropRoleStatement(HiveParser.DropRoleStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#grantPrivileges}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGrantPrivileges(HiveParser.GrantPrivilegesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#revokePrivileges}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRevokePrivileges(HiveParser.RevokePrivilegesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#grantRole}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGrantRole(HiveParser.GrantRoleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#revokeRole}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRevokeRole(HiveParser.RevokeRoleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#showRoleGrants}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowRoleGrants(HiveParser.ShowRoleGrantsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#showRoles}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowRoles(HiveParser.ShowRolesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#showCurrentRole}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowCurrentRole(HiveParser.ShowCurrentRoleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#setRole}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetRole(HiveParser.SetRoleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#showGrants}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowGrants(HiveParser.ShowGrantsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#showRolePrincipals}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowRolePrincipals(HiveParser.ShowRolePrincipalsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#privilegeIncludeColObject}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrivilegeIncludeColObject(HiveParser.PrivilegeIncludeColObjectContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#privilegeObject}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrivilegeObject(HiveParser.PrivilegeObjectContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#privObject}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrivObject(HiveParser.PrivObjectContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#privObjectCols}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrivObjectCols(HiveParser.PrivObjectColsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#privilegeList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrivilegeList(HiveParser.PrivilegeListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#privlegeDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrivlegeDef(HiveParser.PrivlegeDefContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#privilegeType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrivilegeType(HiveParser.PrivilegeTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#principalSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrincipalSpecification(HiveParser.PrincipalSpecificationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#principalName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrincipalName(HiveParser.PrincipalNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#withGrantOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWithGrantOption(HiveParser.WithGrantOptionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#grantOptionFor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGrantOptionFor(HiveParser.GrantOptionForContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#adminOptionFor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAdminOptionFor(HiveParser.AdminOptionForContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#withAdminOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWithAdminOption(HiveParser.WithAdminOptionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#metastoreCheck}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMetastoreCheck(HiveParser.MetastoreCheckContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#resourceList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResourceList(HiveParser.ResourceListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#resource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResource(HiveParser.ResourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#resourceType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResourceType(HiveParser.ResourceTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createFunctionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateFunctionStatement(HiveParser.CreateFunctionStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropFunctionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropFunctionStatement(HiveParser.DropFunctionStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#reloadFunctionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReloadFunctionStatement(HiveParser.ReloadFunctionStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createMacroStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateMacroStatement(HiveParser.CreateMacroStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropMacroStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropMacroStatement(HiveParser.DropMacroStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createViewStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateViewStatement(HiveParser.CreateViewStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createMaterializedViewStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateMaterializedViewStatement(HiveParser.CreateMaterializedViewStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#viewPartition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitViewPartition(HiveParser.ViewPartitionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropViewStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropViewStatement(HiveParser.DropViewStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropMaterializedViewStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropMaterializedViewStatement(HiveParser.DropMaterializedViewStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#showFunctionIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowFunctionIdentifier(HiveParser.ShowFunctionIdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#showStmtIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowStmtIdentifier(HiveParser.ShowStmtIdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableComment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableComment(HiveParser.TableCommentContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tablePartition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTablePartition(HiveParser.TablePartitionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableBuckets}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableBuckets(HiveParser.TableBucketsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableSkewed}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableSkewed(HiveParser.TableSkewedContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#rowFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRowFormat(HiveParser.RowFormatContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#recordReader}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRecordReader(HiveParser.RecordReaderContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#recordWriter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRecordWriter(HiveParser.RecordWriterContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#rowFormatSerde}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRowFormatSerde(HiveParser.RowFormatSerdeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#rowFormatDelimited}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRowFormatDelimited(HiveParser.RowFormatDelimitedContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableRowFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableRowFormat(HiveParser.TableRowFormatContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tablePropertiesPrefixed}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTablePropertiesPrefixed(HiveParser.TablePropertiesPrefixedContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableProperties}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableProperties(HiveParser.TablePropertiesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tablePropertiesList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTablePropertiesList(HiveParser.TablePropertiesListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#keyValueProperty}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitKeyValueProperty(HiveParser.KeyValuePropertyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#keyProperty}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitKeyProperty(HiveParser.KeyPropertyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableRowFormatFieldIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableRowFormatFieldIdentifier(HiveParser.TableRowFormatFieldIdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableRowFormatCollItemsIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableRowFormatCollItemsIdentifier(
            HiveParser.TableRowFormatCollItemsIdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableRowFormatMapKeysIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableRowFormatMapKeysIdentifier(HiveParser.TableRowFormatMapKeysIdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableRowFormatLinesIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableRowFormatLinesIdentifier(HiveParser.TableRowFormatLinesIdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableRowNullFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableRowNullFormat(HiveParser.TableRowNullFormatContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableFileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableFileFormat(HiveParser.TableFileFormatContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableLocation(HiveParser.TableLocationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameTypeList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameTypeList(HiveParser.ColumnNameTypeListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameTypeOrConstraintList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameTypeOrConstraintList(HiveParser.ColumnNameTypeOrConstraintListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameColonTypeList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameColonTypeList(HiveParser.ColumnNameColonTypeListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameList(HiveParser.ColumnNameListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnName(HiveParser.ColumnNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#extColumnName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtColumnName(HiveParser.ExtColumnNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameOrderList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameOrderList(HiveParser.ColumnNameOrderListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnParenthesesList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnParenthesesList(HiveParser.ColumnParenthesesListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#enableValidateSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEnableValidateSpecification(HiveParser.EnableValidateSpecificationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#enableSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEnableSpecification(HiveParser.EnableSpecificationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#validateSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValidateSpecification(HiveParser.ValidateSpecificationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#enforcedSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEnforcedSpecification(HiveParser.EnforcedSpecificationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#relySpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRelySpecification(HiveParser.RelySpecificationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateConstraint(HiveParser.CreateConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterConstraintWithName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterConstraintWithName(HiveParser.AlterConstraintWithNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#pkConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPkConstraint(HiveParser.PkConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#createForeignKey}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateForeignKey(HiveParser.CreateForeignKeyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterForeignKeyWithName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterForeignKeyWithName(HiveParser.AlterForeignKeyWithNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedValueElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedValueElement(HiveParser.SkewedValueElementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedColumnValuePairList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedColumnValuePairList(HiveParser.SkewedColumnValuePairListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedColumnValuePair}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedColumnValuePair(HiveParser.SkewedColumnValuePairContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedColumnValues}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedColumnValues(HiveParser.SkewedColumnValuesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedColumnValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedColumnValue(HiveParser.SkewedColumnValueContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#skewedValueLocationElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewedValueLocationElement(HiveParser.SkewedValueLocationElementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#orderSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrderSpecification(HiveParser.OrderSpecificationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#nullOrdering}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNullOrdering(HiveParser.NullOrderingContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameOrder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameOrder(HiveParser.ColumnNameOrderContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameCommentList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameCommentList(HiveParser.ColumnNameCommentListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameComment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameComment(HiveParser.ColumnNameCommentContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnRefOrder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnRefOrder(HiveParser.ColumnRefOrderContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameType(HiveParser.ColumnNameTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameTypeOrConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameTypeOrConstraint(HiveParser.ColumnNameTypeOrConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableConstraint(HiveParser.TableConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameTypeConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameTypeConstraint(HiveParser.ColumnNameTypeConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnConstraint(HiveParser.ColumnConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#foreignKeyConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForeignKeyConstraint(HiveParser.ForeignKeyConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#colConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColConstraint(HiveParser.ColConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterColumnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterColumnConstraint(HiveParser.AlterColumnConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterForeignKeyConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterForeignKeyConstraint(HiveParser.AlterForeignKeyConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#alterColConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterColConstraint(HiveParser.AlterColConstraintContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableConstraintPrimaryKey}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableConstraintPrimaryKey(HiveParser.TableConstraintPrimaryKeyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#constraintOptsCreate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstraintOptsCreate(HiveParser.ConstraintOptsCreateContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#constraintOptsAlter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstraintOptsAlter(HiveParser.ConstraintOptsAlterContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnNameColonType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnNameColonType(HiveParser.ColumnNameColonTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#colType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColType(HiveParser.ColTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#colTypeList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColTypeList(HiveParser.ColTypeListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#type_db_col}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType_db_col(HiveParser.Type_db_colContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#primitiveType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimitiveType(HiveParser.PrimitiveTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#listType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitListType(HiveParser.ListTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#structType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStructType(HiveParser.StructTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#mapType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMapType(HiveParser.MapTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#unionType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnionType(HiveParser.UnionTypeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#setOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetOperator(HiveParser.SetOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#queryStatementExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQueryStatementExpression(HiveParser.QueryStatementExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#queryStatementExpressionBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQueryStatementExpressionBody(HiveParser.QueryStatementExpressionBodyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#withClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWithClause(HiveParser.WithClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#cteStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCteStatement(HiveParser.CteStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#fromStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFromStatement(HiveParser.FromStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#singleFromStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSingleFromStatement(HiveParser.SingleFromStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#regularBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRegularBody(HiveParser.RegularBodyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#atomSelectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtomSelectStatement(HiveParser.AtomSelectStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#selectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectStatement(HiveParser.SelectStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#setOpSelectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetOpSelectStatement(HiveParser.SetOpSelectStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#selectStatementWithCTE}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectStatementWithCTE(HiveParser.SelectStatementWithCTEContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBody(HiveParser.BodyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#insertClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInsertClause(HiveParser.InsertClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#destination}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDestination(HiveParser.DestinationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#limitClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLimitClause(HiveParser.LimitClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#deleteStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDeleteStatement(HiveParser.DeleteStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnAssignmentClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnAssignmentClause(HiveParser.ColumnAssignmentClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#setColumnsClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetColumnsClause(HiveParser.SetColumnsClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#updateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUpdateStatement(HiveParser.UpdateStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#sqlTransactionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSqlTransactionStatement(HiveParser.SqlTransactionStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#startTransactionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStartTransactionStatement(HiveParser.StartTransactionStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#transactionMode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTransactionMode(HiveParser.TransactionModeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#transactionAccessMode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTransactionAccessMode(HiveParser.TransactionAccessModeContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#isolationLevel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsolationLevel(HiveParser.IsolationLevelContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#levelOfIsolation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLevelOfIsolation(HiveParser.LevelOfIsolationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#commitStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCommitStatement(HiveParser.CommitStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#rollbackStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRollbackStatement(HiveParser.RollbackStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#setAutoCommitStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetAutoCommitStatement(HiveParser.SetAutoCommitStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#abortTransactionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAbortTransactionStatement(HiveParser.AbortTransactionStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#mergeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMergeStatement(HiveParser.MergeStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#whenClauses}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhenClauses(HiveParser.WhenClausesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#whenNotMatchedClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhenNotMatchedClause(HiveParser.WhenNotMatchedClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#whenMatchedAndClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhenMatchedAndClause(HiveParser.WhenMatchedAndClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#whenMatchedThenClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhenMatchedThenClause(HiveParser.WhenMatchedThenClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#updateOrDelete}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUpdateOrDelete(HiveParser.UpdateOrDeleteContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#killQueryStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitKillQueryStatement(HiveParser.KillQueryStatementContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#selectClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectClause(HiveParser.SelectClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#selectList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectList(HiveParser.SelectListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#selectTrfmClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectTrfmClause(HiveParser.SelectTrfmClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#selectItem}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectItem(HiveParser.SelectItemContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#trfmClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTrfmClause(HiveParser.TrfmClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#selectExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectExpression(HiveParser.SelectExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#selectExpressionList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectExpressionList(HiveParser.SelectExpressionListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#window_clause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindow_clause(HiveParser.Window_clauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#window_defn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindow_defn(HiveParser.Window_defnContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#window_specification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindow_specification(HiveParser.Window_specificationContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#window_frame}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindow_frame(HiveParser.Window_frameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#window_range_expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindow_range_expression(HiveParser.Window_range_expressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#window_value_expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindow_value_expression(HiveParser.Window_value_expressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#window_frame_start_boundary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindow_frame_start_boundary(HiveParser.Window_frame_start_boundaryContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#window_frame_boundary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindow_frame_boundary(HiveParser.Window_frame_boundaryContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableAllColumns}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableAllColumns(HiveParser.TableAllColumnsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableOrColumn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableOrColumn(HiveParser.TableOrColumnContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#expressionList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpressionList(HiveParser.ExpressionListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#aliasList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAliasList(HiveParser.AliasListContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#fromClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFromClause(HiveParser.FromClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#fromSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFromSource(HiveParser.FromSourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#atomjoinSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtomjoinSource(HiveParser.AtomjoinSourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#joinSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJoinSource(HiveParser.JoinSourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#joinSourcePart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJoinSourcePart(HiveParser.JoinSourcePartContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#uniqueJoinSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUniqueJoinSource(HiveParser.UniqueJoinSourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#uniqueJoinExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUniqueJoinExpr(HiveParser.UniqueJoinExprContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#uniqueJoinToken}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUniqueJoinToken(HiveParser.UniqueJoinTokenContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#joinToken}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJoinToken(HiveParser.JoinTokenContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#lateralView}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLateralView(HiveParser.LateralViewContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableAlias}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableAlias(HiveParser.TableAliasContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableBucketSample}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableBucketSample(HiveParser.TableBucketSampleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#splitSample}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSplitSample(HiveParser.SplitSampleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableSample}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableSample(HiveParser.TableSampleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableSource(HiveParser.TableSourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#uniqueJoinTableSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUniqueJoinTableSource(HiveParser.UniqueJoinTableSourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableName(HiveParser.TableNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#viewName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitViewName(HiveParser.ViewNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#subQuerySource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubQuerySource(HiveParser.SubQuerySourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#partitioningSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitioningSpec(HiveParser.PartitioningSpecContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#partitionTableFunctionSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionTableFunctionSource(HiveParser.PartitionTableFunctionSourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#partitionedTableFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionedTableFunction(HiveParser.PartitionedTableFunctionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#whereClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhereClause(HiveParser.WhereClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#searchCondition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSearchCondition(HiveParser.SearchConditionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#valuesClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValuesClause(HiveParser.ValuesClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#valuesTableConstructor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValuesTableConstructor(HiveParser.ValuesTableConstructorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#valueRowConstructor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueRowConstructor(HiveParser.ValueRowConstructorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#virtualTableSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVirtualTableSource(HiveParser.VirtualTableSourceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#groupByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroupByClause(HiveParser.GroupByClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#groupby_expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroupby_expression(HiveParser.Groupby_expressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#groupByEmpty}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroupByEmpty(HiveParser.GroupByEmptyContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#rollupStandard}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRollupStandard(HiveParser.RollupStandardContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#rollupOldSyntax}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRollupOldSyntax(HiveParser.RollupOldSyntaxContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#groupingSetExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroupingSetExpression(HiveParser.GroupingSetExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#groupingSetExpressionMultiple}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroupingSetExpressionMultiple(HiveParser.GroupingSetExpressionMultipleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#groupingExpressionSingle}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroupingExpressionSingle(HiveParser.GroupingExpressionSingleContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#havingClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHavingClause(HiveParser.HavingClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#havingCondition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHavingCondition(HiveParser.HavingConditionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#expressionsInParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpressionsInParenthesis(HiveParser.ExpressionsInParenthesisContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#expressionsNotInParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpressionsNotInParenthesis(HiveParser.ExpressionsNotInParenthesisContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#expressionPart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpressionPart(HiveParser.ExpressionPartContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#expressions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpressions(HiveParser.ExpressionsContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnRefOrderInParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnRefOrderInParenthesis(HiveParser.ColumnRefOrderInParenthesisContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#columnRefOrderNotInParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnRefOrderNotInParenthesis(HiveParser.ColumnRefOrderNotInParenthesisContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#orderByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrderByClause(HiveParser.OrderByClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#clusterByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClusterByClause(HiveParser.ClusterByClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#partitionByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionByClause(HiveParser.PartitionByClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#distributeByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDistributeByClause(HiveParser.DistributeByClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#sortByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSortByClause(HiveParser.SortByClauseContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#function}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunction(HiveParser.FunctionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#functionName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionName(HiveParser.FunctionNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#castExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCastExpression(HiveParser.CastExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#caseExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCaseExpression(HiveParser.CaseExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#whenExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhenExpression(HiveParser.WhenExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#floorExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloorExpression(HiveParser.FloorExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#floorDateQualifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloorDateQualifiers(HiveParser.FloorDateQualifiersContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#extractExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtractExpression(HiveParser.ExtractExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#timeQualifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTimeQualifiers(HiveParser.TimeQualifiersContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstant(HiveParser.ConstantContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#stringLiteralSequence}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringLiteralSequence(HiveParser.StringLiteralSequenceContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#charSetStringLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCharSetStringLiteral(HiveParser.CharSetStringLiteralContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dateLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDateLiteral(HiveParser.DateLiteralContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#timestampLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTimestampLiteral(HiveParser.TimestampLiteralContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#timestampLocalTZLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTimestampLocalTZLiteral(HiveParser.TimestampLocalTZLiteralContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#intervalValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntervalValue(HiveParser.IntervalValueContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#intervalLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntervalLiteral(HiveParser.IntervalLiteralContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#intervalExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntervalExpression(HiveParser.IntervalExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#intervalQualifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntervalQualifiers(HiveParser.IntervalQualifiersContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtomExpression(HiveParser.AtomExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceUnaryOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceUnaryOperator(HiveParser.PrecedenceUnaryOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#isCondition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsCondition(HiveParser.IsConditionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceBitwiseXorOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceBitwiseXorOperator(HiveParser.PrecedenceBitwiseXorOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceStarOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceStarOperator(HiveParser.PrecedenceStarOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedencePlusOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedencePlusOperator(HiveParser.PrecedencePlusOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceConcatenateOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceConcatenateOperator(HiveParser.PrecedenceConcatenateOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceAmpersandOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceAmpersandOperator(HiveParser.PrecedenceAmpersandOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceBitwiseOrOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceBitwiseOrOperator(HiveParser.PrecedenceBitwiseOrOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceRegexpOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceRegexpOperator(HiveParser.PrecedenceRegexpOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceComparisonOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceComparisonOperator(HiveParser.PrecedenceComparisonOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceNotOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceNotOperator(HiveParser.PrecedenceNotOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceLogicOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceLogicOperator(HiveParser.PrecedenceLogicOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(HiveParser.ExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceExpression(HiveParser.PrecedenceExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#precedenceSimilarExpressionIn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecedenceSimilarExpressionIn(HiveParser.PrecedenceSimilarExpressionInContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#subQueryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubQueryExpression(HiveParser.SubQueryExpressionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#booleanValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBooleanValue(HiveParser.BooleanValueContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#booleanValueTok}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBooleanValueTok(HiveParser.BooleanValueTokContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#tableOrPartition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableOrPartition(HiveParser.TableOrPartitionContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#partitionSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionSpec(HiveParser.PartitionSpecContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#partitionVal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionVal(HiveParser.PartitionValContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropPartitionSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropPartitionSpec(HiveParser.DropPartitionSpecContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropPartitionVal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropPartitionVal(HiveParser.DropPartitionValContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#dropPartitionOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropPartitionOperator(HiveParser.DropPartitionOperatorContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#sysFuncNames}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSysFuncNames(HiveParser.SysFuncNamesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#descFuncNames}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDescFuncNames(HiveParser.DescFuncNamesContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(HiveParser.IdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#functionIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionIdentifier(HiveParser.FunctionIdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#principalIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrincipalIdentifier(HiveParser.PrincipalIdentifierContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#nonReserved}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNonReserved(HiveParser.NonReservedContext ctx);
    /**
     * Visit a parse tree produced by {@link HiveParser#sql11ReservedKeywordsUsedAsFunctionName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSql11ReservedKeywordsUsedAsFunctionName(
            HiveParser.Sql11ReservedKeywordsUsedAsFunctionNameContext ctx);
}
