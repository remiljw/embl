use strict;
use warnings;

use Bio::EnsEMBL::Registry;

my $registry = 'Bio::EnsEMBL::Registry';

$registry->load_registry_from_db(
    -host => 'ensembldb.ensembl.org', # alternatively 'useastdb.ensembl.org'
    -user => 'anonymous'

);
my $slice_adaptor = $registry->get_adaptor( 'Human', 'Core', 'Slice' );
my $slice = $slice_adaptor->fetch_by_region( 'chromosome', '10', 3770000, 3790000 );

# Get all the genes in the slice
my @genes = @{ $slice->get_all_Genes() };

foreach my $gene (@genes){
	printf( "In terms of slice: %d-%d (%+d)\n",
    	$gene->start(),
    	$gene->end(),
    	$gene->strand() );
	printf( "In terms of seq_region: %d-%d (%+d)\n",
    	$gene->seq_region_start(),
    	$gene->seq_region_end(),
    	$gene->seq_region_strand() );
}

my $new_feature = $gene->transform('toplevel');

printf(
    "Feature's toplevel position is: %s %s %d-%d (%+d)\n",
    $new_feature->slice->coord_system->name(),
    $new_feature->slice->seq_region_name(),
    $new_feature->start(),
    $new_feature->end(),
    $new_feature->strand()
);
# my $slice = $slice_adaptor->fetch_by_name('chromosome');
# my$slice = $slice_adaptor->fetch_by_region( 'chromosome', '10', 1e6, 10e6,  'GRCh37' );

# my $cs_adaptor = $registry->get_adaptor( 'Human', 'Core', 'CoordSystem' );
# my $cs = $cs_adaptor->fetch_by_name('chromosome');

# printf "Coordinate system: %s %s\n", $cs->name(), $cs->version();
# # my $new_slice =
# #   $slice_adaptor->fetch_by_region( 'chromosome', '10', 3e4, 3e4 );



# my $slice = $slice_adaptor->fetch_by_region( 'chromosome', '10',
# 1e4, 1e6 );

# my $new_slice =
#   $slice_adaptor->fetch_by_region( 'chromosome', '10', 1.5e6, 2e6 );

# if ( my $new_feature = $cs->transform('clone') ) {
#     printf(
#         "Feature's clonal position is: %s %d-%d (%+d)\n",
#         $new_feature->slice->seq_region_name(),
#         $new_feature->start(), $new_feature->end(), $new_feature->strand()
#     );
# } else {
#     print "Feature is not defined in clonal coordinate system\n";
# }
# foreach my $simple_feature ( @{ $slice->get_all_SimpleFeatures('Eponine') } ) {
#     printf(
#         "Before:\t%6d - %6d\nbef_name:\t%s\n" ,
#         $simple_feature->start(),
#         $simple_feature->end(),
#         $simple_feature->version()
#     );

#     my $new_feature = $simple_feature->transfer($new_slice);
#     if ( !defined $new_feature ) {
#       print "Could not transfer feature\n";
#     } else {
#       printf( "After:\t%6d - %6d\naftr_name:\t%s\n",
#       $new_feature->start(),
#       $new_feature->end(),
#       $new_feature->version()
#       );
#     }
# }



# my $seqname = $slice->seq_region_name();
# my $start   = $slice->start();
# my $end     = $slice->end();

#   # get the sequence from the slice
# my $seq = $slice->seq();
# my $name = $slice->coord_system->version();

# if ( my $new_feature = $slice->transform('clone') ) {
#     printf(
#         "Feature's clonal position is: %s %d-%d (%+d)\n",
#         $new_feature->slice->seq_region_name(),
#         $new_feature->start(), $new_feature->end(), $new_feature->strand()
#     );
# } else {
#     print "Feature is not defined in clonal coordinate system\n";
# }
# printf(
#         "seqName\t%s\nstart\t%s\nend\t%s\ncoord_name\t%s\n",
#         $seqname,   $start,
#         $end, $name
#     );

# my $cs_adaptor = $registry->get_adaptor( 'Human', 'Core', 'CoordSystem' );
# my $cs = $cs_adaptor->fetch_by_name('chromosome');

# printf "Coordinate system: %s %s\n", $cs->name(), $cs->version();
# my @coord_systems = @{ $cs_adaptor->fetch_all() };
# foreach $cs (@coord_systems) {
#     printf "Coordinate system: %s %s\n", $cs->name(), $cs->version;
# }