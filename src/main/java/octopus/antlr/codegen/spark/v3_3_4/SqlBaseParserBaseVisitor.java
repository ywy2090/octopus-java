// Generated from
// /Users/octopus/octo/code/my-first-java/src/main/resources/g4/spark/v3_3_4/SqlBaseParser.g4 by
// ANTLR 4.13.1
package octopus.antlr.codegen.spark.v3_3_4;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link SqlBaseParserVisitor}, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
@SuppressWarnings("CheckReturnValue")
public class SqlBaseParserBaseVisitor<T> extends AbstractParseTreeVisitor<T>
        implements SqlBaseParserVisitor<T> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSingleExpression(SqlBaseParser.SingleExpressionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSingleTableIdentifier(SqlBaseParser.SingleTableIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSingleMultipartIdentifier(SqlBaseParser.SingleMultipartIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSingleFunctionIdentifier(SqlBaseParser.SingleFunctionIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSingleDataType(SqlBaseParser.SingleDataTypeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSingleTableSchema(SqlBaseParser.SingleTableSchemaContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDmlStatement(SqlBaseParser.DmlStatementContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitUse(SqlBaseParser.UseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitUseNamespace(SqlBaseParser.UseNamespaceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetCatalog(SqlBaseParser.SetCatalogContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateNamespace(SqlBaseParser.CreateNamespaceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetNamespaceProperties(SqlBaseParser.SetNamespacePropertiesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetNamespaceLocation(SqlBaseParser.SetNamespaceLocationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDropNamespace(SqlBaseParser.DropNamespaceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowNamespaces(SqlBaseParser.ShowNamespacesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateTable(SqlBaseParser.CreateTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateTableLike(SqlBaseParser.CreateTableLikeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitReplaceTable(SqlBaseParser.ReplaceTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAnalyze(SqlBaseParser.AnalyzeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAnalyzeTables(SqlBaseParser.AnalyzeTablesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAddTableColumns(SqlBaseParser.AddTableColumnsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRenameTableColumn(SqlBaseParser.RenameTableColumnContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDropTableColumns(SqlBaseParser.DropTableColumnsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRenameTable(SqlBaseParser.RenameTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetTableProperties(SqlBaseParser.SetTablePropertiesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitUnsetTableProperties(SqlBaseParser.UnsetTablePropertiesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAlterTableAlterColumn(SqlBaseParser.AlterTableAlterColumnContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHiveChangeColumn(SqlBaseParser.HiveChangeColumnContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHiveReplaceColumns(SqlBaseParser.HiveReplaceColumnsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetTableSerDe(SqlBaseParser.SetTableSerDeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAddTablePartition(SqlBaseParser.AddTablePartitionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRenameTablePartition(SqlBaseParser.RenameTablePartitionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDropTablePartitions(SqlBaseParser.DropTablePartitionsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetTableLocation(SqlBaseParser.SetTableLocationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRecoverPartitions(SqlBaseParser.RecoverPartitionsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDropTable(SqlBaseParser.DropTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDropView(SqlBaseParser.DropViewContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateView(SqlBaseParser.CreateViewContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateTempViewUsing(SqlBaseParser.CreateTempViewUsingContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAlterViewQuery(SqlBaseParser.AlterViewQueryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateFunction(SqlBaseParser.CreateFunctionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDropFunction(SqlBaseParser.DropFunctionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitExplain(SqlBaseParser.ExplainContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowTables(SqlBaseParser.ShowTablesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowTableExtended(SqlBaseParser.ShowTableExtendedContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowTblProperties(SqlBaseParser.ShowTblPropertiesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowColumns(SqlBaseParser.ShowColumnsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowViews(SqlBaseParser.ShowViewsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowPartitions(SqlBaseParser.ShowPartitionsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowFunctions(SqlBaseParser.ShowFunctionsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowCreateTable(SqlBaseParser.ShowCreateTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowCurrentNamespace(SqlBaseParser.ShowCurrentNamespaceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitShowCatalogs(SqlBaseParser.ShowCatalogsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDescribeFunction(SqlBaseParser.DescribeFunctionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDescribeNamespace(SqlBaseParser.DescribeNamespaceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDescribeRelation(SqlBaseParser.DescribeRelationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDescribeQuery(SqlBaseParser.DescribeQueryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCommentNamespace(SqlBaseParser.CommentNamespaceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCommentTable(SqlBaseParser.CommentTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRefreshTable(SqlBaseParser.RefreshTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRefreshFunction(SqlBaseParser.RefreshFunctionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRefreshResource(SqlBaseParser.RefreshResourceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCacheTable(SqlBaseParser.CacheTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitUncacheTable(SqlBaseParser.UncacheTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitClearCache(SqlBaseParser.ClearCacheContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLoadData(SqlBaseParser.LoadDataContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTruncateTable(SqlBaseParser.TruncateTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRepairTable(SqlBaseParser.RepairTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitManageResource(SqlBaseParser.ManageResourceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFailNativeCommand(SqlBaseParser.FailNativeCommandContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetTimeZone(SqlBaseParser.SetTimeZoneContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetQuotedConfiguration(SqlBaseParser.SetQuotedConfigurationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetConfiguration(SqlBaseParser.SetConfigurationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitResetQuotedConfiguration(SqlBaseParser.ResetQuotedConfigurationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitResetConfiguration(SqlBaseParser.ResetConfigurationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateIndex(SqlBaseParser.CreateIndexContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDropIndex(SqlBaseParser.DropIndexContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitConfigKey(SqlBaseParser.ConfigKeyContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitConfigValue(SqlBaseParser.ConfigValueContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitUnsupportedHiveNativeCommands(
            SqlBaseParser.UnsupportedHiveNativeCommandsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateTableHeader(SqlBaseParser.CreateTableHeaderContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitReplaceTableHeader(SqlBaseParser.ReplaceTableHeaderContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitBucketSpec(SqlBaseParser.BucketSpecContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSkewSpec(SqlBaseParser.SkewSpecContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLocationSpec(SqlBaseParser.LocationSpecContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCommentSpec(SqlBaseParser.CommentSpecContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQuery(SqlBaseParser.QueryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitInsertOverwriteTable(SqlBaseParser.InsertOverwriteTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitInsertIntoTable(SqlBaseParser.InsertIntoTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitInsertOverwriteHiveDir(SqlBaseParser.InsertOverwriteHiveDirContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitInsertOverwriteDir(SqlBaseParser.InsertOverwriteDirContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPartitionSpecLocation(SqlBaseParser.PartitionSpecLocationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPartitionSpec(SqlBaseParser.PartitionSpecContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPartitionVal(SqlBaseParser.PartitionValContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNamespace(SqlBaseParser.NamespaceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNamespaces(SqlBaseParser.NamespacesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDescribeFuncName(SqlBaseParser.DescribeFuncNameContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDescribeColName(SqlBaseParser.DescribeColNameContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCtes(SqlBaseParser.CtesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNamedQuery(SqlBaseParser.NamedQueryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTableProvider(SqlBaseParser.TableProviderContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateTableClauses(SqlBaseParser.CreateTableClausesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPropertyList(SqlBaseParser.PropertyListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitProperty(SqlBaseParser.PropertyContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPropertyKey(SqlBaseParser.PropertyKeyContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPropertyValue(SqlBaseParser.PropertyValueContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitConstantList(SqlBaseParser.ConstantListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNestedConstantList(SqlBaseParser.NestedConstantListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCreateFileFormat(SqlBaseParser.CreateFileFormatContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTableFileFormat(SqlBaseParser.TableFileFormatContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitGenericFileFormat(SqlBaseParser.GenericFileFormatContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitStorageHandler(SqlBaseParser.StorageHandlerContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitResource(SqlBaseParser.ResourceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSingleInsertQuery(SqlBaseParser.SingleInsertQueryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMultiInsertQuery(SqlBaseParser.MultiInsertQueryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDeleteFromTable(SqlBaseParser.DeleteFromTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitUpdateTable(SqlBaseParser.UpdateTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMergeIntoTable(SqlBaseParser.MergeIntoTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQueryOrganization(SqlBaseParser.QueryOrganizationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMultiInsertQueryBody(SqlBaseParser.MultiInsertQueryBodyContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetOperation(SqlBaseParser.SetOperationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFromStmt(SqlBaseParser.FromStmtContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTable(SqlBaseParser.TableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitInlineTableDefault1(SqlBaseParser.InlineTableDefault1Context ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSubquery(SqlBaseParser.SubqueryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSortItem(SqlBaseParser.SortItemContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFromStatement(SqlBaseParser.FromStatementContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFromStatementBody(SqlBaseParser.FromStatementBodyContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTransformQuerySpecification(
            SqlBaseParser.TransformQuerySpecificationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRegularQuerySpecification(SqlBaseParser.RegularQuerySpecificationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTransformClause(SqlBaseParser.TransformClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSelectClause(SqlBaseParser.SelectClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetClause(SqlBaseParser.SetClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMatchedClause(SqlBaseParser.MatchedClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNotMatchedClause(SqlBaseParser.NotMatchedClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMatchedAction(SqlBaseParser.MatchedActionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNotMatchedAction(SqlBaseParser.NotMatchedActionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAssignmentList(SqlBaseParser.AssignmentListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAssignment(SqlBaseParser.AssignmentContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitWhereClause(SqlBaseParser.WhereClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHavingClause(SqlBaseParser.HavingClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHint(SqlBaseParser.HintContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHintStatement(SqlBaseParser.HintStatementContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFromClause(SqlBaseParser.FromClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTemporalClause(SqlBaseParser.TemporalClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAggregationClause(SqlBaseParser.AggregationClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitGroupByClause(SqlBaseParser.GroupByClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitGroupingAnalytics(SqlBaseParser.GroupingAnalyticsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitGroupingElement(SqlBaseParser.GroupingElementContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitGroupingSet(SqlBaseParser.GroupingSetContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPivotClause(SqlBaseParser.PivotClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPivotColumn(SqlBaseParser.PivotColumnContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPivotValue(SqlBaseParser.PivotValueContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLateralView(SqlBaseParser.LateralViewContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRelation(SqlBaseParser.RelationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitJoinRelation(SqlBaseParser.JoinRelationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitJoinType(SqlBaseParser.JoinTypeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSample(SqlBaseParser.SampleContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSampleByPercentile(SqlBaseParser.SampleByPercentileContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSampleByRows(SqlBaseParser.SampleByRowsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSampleByBucket(SqlBaseParser.SampleByBucketContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSampleByBytes(SqlBaseParser.SampleByBytesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIdentifierList(SqlBaseParser.IdentifierListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIdentifierSeq(SqlBaseParser.IdentifierSeqContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitOrderedIdentifierList(SqlBaseParser.OrderedIdentifierListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitOrderedIdentifier(SqlBaseParser.OrderedIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIdentifierCommentList(SqlBaseParser.IdentifierCommentListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIdentifierComment(SqlBaseParser.IdentifierCommentContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTableName(SqlBaseParser.TableNameContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAliasedQuery(SqlBaseParser.AliasedQueryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitInlineTableDefault2(SqlBaseParser.InlineTableDefault2Context ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTableValuedFunction(SqlBaseParser.TableValuedFunctionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitInlineTable(SqlBaseParser.InlineTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFunctionTable(SqlBaseParser.FunctionTableContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTableAlias(SqlBaseParser.TableAliasContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRowFormatSerde(SqlBaseParser.RowFormatSerdeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRowFormatDelimited(SqlBaseParser.RowFormatDelimitedContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMultipartIdentifierList(SqlBaseParser.MultipartIdentifierListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMultipartIdentifier(SqlBaseParser.MultipartIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMultipartIdentifierPropertyList(
            SqlBaseParser.MultipartIdentifierPropertyListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMultipartIdentifierProperty(
            SqlBaseParser.MultipartIdentifierPropertyContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFunctionIdentifier(SqlBaseParser.FunctionIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNamedExpression(SqlBaseParser.NamedExpressionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNamedExpressionSeq(SqlBaseParser.NamedExpressionSeqContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPartitionFieldList(SqlBaseParser.PartitionFieldListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPartitionTransform(SqlBaseParser.PartitionTransformContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPartitionColumn(SqlBaseParser.PartitionColumnContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIdentityTransform(SqlBaseParser.IdentityTransformContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitApplyTransform(SqlBaseParser.ApplyTransformContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTransformArgument(SqlBaseParser.TransformArgumentContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitExpression(SqlBaseParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitExpressionSeq(SqlBaseParser.ExpressionSeqContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLogicalNot(SqlBaseParser.LogicalNotContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPredicated(SqlBaseParser.PredicatedContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitExists(SqlBaseParser.ExistsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPredicate(SqlBaseParser.PredicateContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitComparison(SqlBaseParser.ComparisonContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDatetimeUnit(SqlBaseParser.DatetimeUnitContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitStruct(SqlBaseParser.StructContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDereference(SqlBaseParser.DereferenceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTimestampadd(SqlBaseParser.TimestampaddContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSubstring(SqlBaseParser.SubstringContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCast(SqlBaseParser.CastContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLambda(SqlBaseParser.LambdaContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTrim(SqlBaseParser.TrimContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitCurrentLike(SqlBaseParser.CurrentLikeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRowConstructor(SqlBaseParser.RowConstructorContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLast(SqlBaseParser.LastContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitStar(SqlBaseParser.StarContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitOverlay(SqlBaseParser.OverlayContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSubscript(SqlBaseParser.SubscriptContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTimestampdiff(SqlBaseParser.TimestampdiffContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSubqueryExpression(SqlBaseParser.SubqueryExpressionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitConstantDefault(SqlBaseParser.ConstantDefaultContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitExtract(SqlBaseParser.ExtractContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPercentile(SqlBaseParser.PercentileContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFunctionCall(SqlBaseParser.FunctionCallContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSearchedCase(SqlBaseParser.SearchedCaseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPosition(SqlBaseParser.PositionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFirst(SqlBaseParser.FirstContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNullLiteral(SqlBaseParser.NullLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitStringLiteral(SqlBaseParser.StringLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitArithmeticOperator(SqlBaseParser.ArithmeticOperatorContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitBooleanValue(SqlBaseParser.BooleanValueContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitInterval(SqlBaseParser.IntervalContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitErrorCapturingMultiUnitsInterval(
            SqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMultiUnitsInterval(SqlBaseParser.MultiUnitsIntervalContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitErrorCapturingUnitToUnitInterval(
            SqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitUnitToUnitInterval(SqlBaseParser.UnitToUnitIntervalContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIntervalValue(SqlBaseParser.IntervalValueContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitColPosition(SqlBaseParser.ColPositionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitComplexDataType(SqlBaseParser.ComplexDataTypeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitYearMonthIntervalDataType(SqlBaseParser.YearMonthIntervalDataTypeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDayTimeIntervalDataType(SqlBaseParser.DayTimeIntervalDataTypeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitPrimitiveDataType(SqlBaseParser.PrimitiveDataTypeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQualifiedColTypeWithPositionList(
            SqlBaseParser.QualifiedColTypeWithPositionListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQualifiedColTypeWithPosition(
            SqlBaseParser.QualifiedColTypeWithPositionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitColTypeList(SqlBaseParser.ColTypeListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitColType(SqlBaseParser.ColTypeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitComplexColTypeList(SqlBaseParser.ComplexColTypeListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitComplexColType(SqlBaseParser.ComplexColTypeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitWhenClause(SqlBaseParser.WhenClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitWindowClause(SqlBaseParser.WindowClauseContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNamedWindow(SqlBaseParser.NamedWindowContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitWindowRef(SqlBaseParser.WindowRefContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitWindowDef(SqlBaseParser.WindowDefContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitWindowFrame(SqlBaseParser.WindowFrameContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFrameBound(SqlBaseParser.FrameBoundContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQualifiedNameList(SqlBaseParser.QualifiedNameListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFunctionName(SqlBaseParser.FunctionNameContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQualifiedName(SqlBaseParser.QualifiedNameContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitErrorCapturingIdentifier(SqlBaseParser.ErrorCapturingIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitErrorIdent(SqlBaseParser.ErrorIdentContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitRealIdent(SqlBaseParser.RealIdentContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIdentifier(SqlBaseParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQuotedIdentifierAlternative(
            SqlBaseParser.QuotedIdentifierAlternativeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitExponentLiteral(SqlBaseParser.ExponentLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLegacyDecimalLiteral(SqlBaseParser.LegacyDecimalLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitBigIntLiteral(SqlBaseParser.BigIntLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitSmallIntLiteral(SqlBaseParser.SmallIntLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitTinyIntLiteral(SqlBaseParser.TinyIntLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFloatLiteral(SqlBaseParser.FloatLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitBigDecimalLiteral(SqlBaseParser.BigDecimalLiteralContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAlterColumnAction(SqlBaseParser.AlterColumnActionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAnsiNonReserved(SqlBaseParser.AnsiNonReservedContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitStrictNonReserved(SqlBaseParser.StrictNonReservedContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitNonReserved(SqlBaseParser.NonReservedContext ctx) {
        return visitChildren(ctx);
    }
}
