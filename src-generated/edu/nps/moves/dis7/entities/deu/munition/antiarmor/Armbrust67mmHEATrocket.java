package edu.nps.moves.dis7.entities.deu.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5ca4dce5;
 * Country: Germany (DEU);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 21228
 */
public class Armbrust67mmHEATrocket extends EntityType
{
    /** Default constructor */
    public Armbrust67mmHEATrocket()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21215, Ballistic
        setSubCategory((byte)10); // uid 21228, Armbrust 67mm HEAT rocket
    }
}
