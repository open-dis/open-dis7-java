package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@21ba0741;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30268
 */
public class HermannMarwede extends EntityType
{
    /** Default constructor */
    public HermannMarwede()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)100); // uid 30266, Search and Rescue Vessels
        setSubCategory((byte)1); // uid 30267, 46m Class
        setSpecific((byte)1); // uid 30268, Hermann Marwede
    }
}
