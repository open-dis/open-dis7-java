package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a631049;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 27367
 */
public class WarningMarkerUXOUnexplodedOrdnance extends EntityType
{
    /** Default constructor */
    public WarningMarkerUXOUnexplodedOrdnance()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)3); // uid 22888, NBC Hazard Markers
        setSpecific((byte)5); // uid 27367, Warning Marker - UXO (Unexploded Ordnance
    }
}
