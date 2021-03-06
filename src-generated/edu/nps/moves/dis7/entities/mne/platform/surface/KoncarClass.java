package edu.nps.moves.dis7.entities.mne.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@16fb356;
 * Country: Montenegro (MNE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30135
 */
public class KoncarClass extends EntityType
{
    /** Default constructor */
    public KoncarClass()
    {
        setCountry(Country.MONTENEGRO_MNE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 30134, Fast Attack Craft
        setSubCategory((byte)1); // uid 30135, Koncar Class
    }
}
