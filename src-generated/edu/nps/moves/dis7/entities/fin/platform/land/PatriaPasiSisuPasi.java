package edu.nps.moves.dis7.entities.fin.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@587e5365;
 * Country: Finland (FIN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27630
 */
public class PatriaPasiSisuPasi extends EntityType
{
    /** Default constructor */
    public PatriaPasiSisuPasi()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 27629, Armored Utility Vehicle
        setSubCategory((byte)2); // uid 27630, Patria Pasi / Sisu Pasi
    }
}
