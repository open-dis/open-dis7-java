package edu.nps.moves.dis7.entities.mne.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1ee4730;
 * Country: Montenegro (MNE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30139
 */
public class POClass extends EntityType
{
    /** Default constructor */
    public POClass()
    {
        setCountry(Country.MONTENEGRO_MNE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 30138, Tank Landing Ship
        setSubCategory((byte)1); // uid 30139, PO Class
    }
}
