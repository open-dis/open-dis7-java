package edu.nps.moves.dis7.entities.swe.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2bb717d7;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 27448
 */
public class _57mmPFHEPrefragmentedHighExplosive extends EntityType
{
    /** Default constructor */
    public _57mmPFHEPrefragmentedHighExplosive()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21641, Ballistic
        setSubCategory((byte)2); // uid 21645, 57 mm
        setSpecific((byte)1); // uid 27448, 57 mm PFHE (Prefragmented High Explosive)
    }
}
