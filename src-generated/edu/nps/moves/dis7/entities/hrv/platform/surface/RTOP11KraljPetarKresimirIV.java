package edu.nps.moves.dis7.entities.hrv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c5eefef;
 * Country: Croatia (HRV);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19337
 */
public class RTOP11KraljPetarKresimirIV extends EntityType
{
    /** Default constructor */
    public RTOP11KraljPetarKresimirIV()
    {
        setCountry(Country.CROATIA_HRV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 19335, Frigate (including Corvettes)
        setSubCategory((byte)1); // uid 19336, Kralj (Type R-03) Class (FSG)
        setSpecific((byte)1); // uid 19337, RTOP 11 Kralj Petar Kresimir IV
    }
}
